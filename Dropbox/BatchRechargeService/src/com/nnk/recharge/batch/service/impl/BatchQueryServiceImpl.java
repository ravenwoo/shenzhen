package com.nnk.recharge.batch.service.impl;

import com.nnk.recharge.batch.dao.BatchQueryDao;
import com.nnk.recharge.batch.dao.impl.BatchQueryDaoImpl;
import com.nnk.recharge.batch.entity.db.BatchVo;
import com.nnk.recharge.batch.service.BatchQueryService;

import java.util.List;

/**
 * Created by wusz on 2015/12/23.
 */
public class BatchQueryServiceImpl implements BatchQueryService {

    private BatchQueryDao batchDao = new BatchQueryDaoImpl();

    @Override
    public List<BatchVo> getRechargeTask(int status) {
        return batchDao.getRechargeTasks(status);
    }

    @Override
    public BatchVo getRechargeTask(long id) {
        return batchDao.getRechargeTask(id);
    }
}
