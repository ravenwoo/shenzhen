package com.nnk.recharge.batch.service.impl;

import com.nnk.recharge.batch.dao.BatchExecuteDao;
import com.nnk.recharge.batch.dao.impl.BatchExecuteDaoImpl;
import com.nnk.recharge.batch.service.BatchExecuteService;

/**
 * Created by wusz on 2015/12/30.
 */
public class BatchExecuteServiceImpl implements BatchExecuteService {

    private BatchExecuteDao batchDao = new BatchExecuteDaoImpl();
    @Override
    public int updateCfmState(long id, int status, int limitStatus) {
        return batchDao.updateCfmState(id, status, limitStatus);
    }

    @Override
    public int updateRechargeSuccess(long id, int count, long batchInputId) {
        return batchDao.updateRechargeSuccess(id, count, batchInputId);
    }

    @Override
    public int updateCfmFail(long id, int count) {
        return batchDao.updateCfmFail(id, count);
    }

    @Override
    public int updateCmfresult(long id, int result) {
        return batchDao.updateCmfresult(id, result);
    }



    @Override
    public int updateProcessCount(long id, long count) {
        return batchDao.updateProcessCount(id, count);
    }

    @Override
    public int updateProcessedCount(long id) {
        return batchDao.updateProcessedCount(id);
    }

    @Override
    public int initProcessCount(long id) {
        return batchDao.initProcessCount(id);
    }
}
