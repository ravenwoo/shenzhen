package com.nnk.recharge.batch.task;

import com.nnk.recharge.batch.common.DateUtil;
import com.nnk.recharge.batch.entity.db.BatchVo;
import com.nnk.recharge.batch.service.BatchRechargeService;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 * 扫描并执行内存中的任务
 * Created by wusz on 2015/12/28.
 */
public class ScanCacheTask implements Runnable {
	
	private static final Logger logger = Logger.getLogger(ScanCacheTask.class);

    @Override
    public void run() {
        try {
            Date nowTime = DateUtil.parse(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss");
            Map<Long, BatchVo> map = BatchRechargeService.batchMap;
            Iterator<Long> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
            	logger.info("检测到缓存数据:" + BatchRechargeService.batchMap);
                long batchId = iterator.next();
                BatchVo batchVo = BatchRechargeService.batchMap.get(batchId);
                Date planTime = batchVo.getStartCfmTime();//计划执行时间
                if (planTime.after(nowTime)) {
                    logger.info("略过未到执行时间的任务:" + batchId);
                    logger.info("当前时间：" + DateUtil.formatDate(nowTime, "yyyy-MM-dd HH:mm:ss"));
                    logger.info("计划时间：" + DateUtil.formatDate(planTime, "yyyy-MM-dd HH:mm:ss"));
                    continue;
                }
                //执行符合条件的批充任务
                iterator.remove();
                BatchRechargeService.threadPool.execute(new RechargeTask(batchVo));
            }
        }catch (Exception e) {
            logger.error("执行任务异常", e);
        }
    }
}
