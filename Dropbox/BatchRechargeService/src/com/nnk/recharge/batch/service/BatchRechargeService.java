package com.nnk.recharge.batch.service;

import com.google.common.collect.Maps;
import com.nnk.recharge.batch.common.SingleThreadExecutors;
import com.nnk.recharge.batch.config.SystemConstant;
import com.nnk.recharge.batch.entity.db.BatchVo;
import com.nnk.recharge.batch.task.ScanCacheTask;
import com.nnk.recharge.batch.task.ScanDbTask;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wusz on 2015/12/23.
 */
public class BatchRechargeService {

    public static Map<Long, BatchVo> batchMap = Maps.newConcurrentMap();
    //启动线程池
    public static ExecutorService threadPool = Executors.newFixedThreadPool(SystemConstant.THREADPOOL_SIZE);

    public void start() {
        //定时扫描数据库任务
        SingleThreadExecutors.scheduleWithFixedDelay(new ScanDbTask(), 0, SystemConstant.AUTO_CHECK_DATABASE_TIME, TimeUnit.MINUTES);

        //定时内存任务
        SingleThreadExecutors.scheduleWithFixedDelay(new ScanCacheTask(), 0, SystemConstant.AUTO_CHECK_CACHE_TIME, TimeUnit.SECONDS);
    }

}
