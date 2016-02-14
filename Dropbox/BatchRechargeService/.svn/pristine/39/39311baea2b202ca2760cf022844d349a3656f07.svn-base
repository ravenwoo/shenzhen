package com.nnk.recharge.batch.dao.impl;

import com.nnk.recharge.batch.common.DBUtils;
import com.nnk.recharge.batch.dao.BatchQueryDao;
import com.nnk.recharge.batch.dao.MyQueryBaseDao;
import com.nnk.recharge.batch.entity.db.BatchVo;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

/**
 * Created by wusz on 2015/12/23.
 */
public class BatchQueryDaoImpl extends MyQueryBaseDao<BatchVo> implements BatchQueryDao {

    private static final Logger logger = Logger.getLogger(BatchQueryDaoImpl.class);

    public BatchQueryDaoImpl() {
        super(BatchVo.class, DBUtils.getQueryDb());
    }

    @Override
    public List<BatchVo> getRechargeTasks(int status) {

        StringBuilder sql = new StringBuilder();
        sql.append("select id,merid,cmftime,start_cfm_time,cfm_state,cfm_success,cfm_fail,everyTimeSendMaxCount,sleepTime,type,processCount,processedCount,task_amount from Batch where cmftime != '0000-00-00 00:00:00' ");
        sql.append(" and cfm_state = " + status);

        logger.info("加载可执行的批充任务[SQL]：" + sql.toString());
        List<BatchVo> batchVos = super.find(sql.toString());
        if (batchVos == null) {
            return Collections.emptyList();
        }
        return batchVos;
    }

    @Override
    public BatchVo getRechargeTask(long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("select id,merid,cmftime,start_cfm_time,cfm_state,cfm_success,cfm_fail,everyTimeSendMaxCount,sleepTime,type,processCount,processedCount,task_amount from Batch ");
        sql.append("where id = " + id);

        logger.info("根据批次号查找批次信息[SQL]：" + sql.toString());

        return super.get(sql.toString());
    }



}
