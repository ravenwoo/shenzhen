package com.nnk.recharge.batch.service.impl;

import com.nnk.recharge.batch.dao.BatchInputQueryDao;
import com.nnk.recharge.batch.dao.impl.BatchInputQueryDaoImpl;
import com.nnk.recharge.batch.entity.db.BatchInputVo;
import com.nnk.recharge.batch.service.BatchInputQueryService;

import java.util.List;

/**
 * Created by wusz on 2015/12/23.
 */
public class BatchInputQueryServiceImpl implements BatchInputQueryService {

    private BatchInputQueryDao batchInputDao = new BatchInputQueryDaoImpl();

    @Override
    public List<BatchInputVo> getBatchInputByBatchNo(long batchNo, long limit) {
        return batchInputDao.getBatchInputByBatchNo(batchNo, limit);
    }

    @Override
    public List<BatchInputVo> isAllSuccess(long batchNo) {
        return batchInputDao.isAllSuccess(batchNo);
    }


}
