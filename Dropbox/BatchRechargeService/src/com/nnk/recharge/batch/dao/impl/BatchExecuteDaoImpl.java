package com.nnk.recharge.batch.dao.impl;

import com.nnk.recharge.batch.common.DBUtils;
import com.nnk.recharge.batch.dao.BatchExecuteDao;
import com.nnk.recharge.batch.dao.MyQueryBaseDao;
import com.nnk.recharge.batch.entity.db.BatchVo;
import org.apache.log4j.Logger;

/**
 * Created by wusz on 2015/12/30.
 */
public class BatchExecuteDaoImpl extends MyQueryBaseDao<BatchVo> implements BatchExecuteDao {

    private static final Logger logger = Logger.getLogger(BatchQueryDaoImpl.class);

    public BatchExecuteDaoImpl() {
        super(BatchVo.class, DBUtils.getOnlineDb());
    }

    @Override
    public int updateCfmState(long id, int status, int limitStatus) {

        String sql = "update Batch set cfm_state =" + status + " where id=" + id + " and cfm_state=" + limitStatus;

        logger.info("更新批充表的任务状态[SQL]: " + sql);

        return super.executeUpdate(sql);
    }

    @Override
    public int updateRechargeSuccess(long id, int count, long batchInputId) {
        String sql = "update Batch,BatchInput set Batch.cfm_success=Batch.cfm_success+" + count + ",BatchInput.cmfresult=99 where Batch.id=" + id + " and BatchInput.id=" + batchInputId;
        logger.info("更新Batch.cfm_success和BatchInput.cmfresult[SQL]: " + sql);
        return super.executeUpdate(sql);
    }

    @Override
    public int updateCfmFail(long id, int count) {
        String sql = "update Batch set cfm_fail=cfm_fail+" + count + " where id=" + id;
        logger.info("更新批充表失败计数[SQL]: " + sql);
        return super.executeUpdate(sql);
    }

    @Override
    public int updateCmfresult(long id, int result) {
        String sql = "update Batch set cmfresult=" + result + " where id=" + id;
        logger.info("更新批充表Batch.Cmfresult[SQL]: " + sql);
        return super.executeUpdate(sql);
    }

    @Override
    public int updateProcessCount(long id, long count) {
        String sql = "update Batch set processCount=" + count + " where id=" + id;
        logger.info("更新批充表Batch.processCount [SQL]: " + sql);
        return super.executeUpdate(sql);
    }

    @Override
    public int updateProcessedCount(long id) {
        String sql = "update Batch set processedCount=processedCount + processCount where id=" + id;
        logger.info("更新批充表Batch.processedCount [SQL]: " + sql);
        return super.executeUpdate(sql);
    }

    @Override
    public int initProcessCount(long id) {
        String sql = "update Batch set processCount=0 where id=" + id;
        logger.info("初始化批充表Batch.processCount 和 start_cfm_time [SQL]: " + sql);
        return super.executeUpdate(sql);
    }
}
