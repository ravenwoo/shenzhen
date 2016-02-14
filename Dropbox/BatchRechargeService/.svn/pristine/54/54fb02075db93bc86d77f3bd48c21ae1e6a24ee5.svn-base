package com.nnk.recharge.batch.service.impl;

import com.nnk.recharge.batch.dao.BatchInputExecuteDao;
import com.nnk.recharge.batch.dao.impl.BatchInputExecuteDaoImpl;
import com.nnk.recharge.batch.service.BatchInputExecuteService;

/**
 * Created by wusz on 2015/12/30.
 */
public class BatchInputExecuteServiceImpl implements BatchInputExecuteService {

    private BatchInputExecuteDao batchInputDao = new BatchInputExecuteDaoImpl();

    @Override
    public int updateComment(long id, String comment) {
        return batchInputDao.updateComment(id, comment);
    }

    @Override
    public int updateOrderId(long id, String orderid) {
        return batchInputDao.updateOrderId(id, orderid);
    }

    @Override
    public int updateSendOrderIdById(long id, String sendOrderId) {
        return batchInputDao.updateSendOrderIdById(id, sendOrderId);
    }

    @Override
    public int updateCmfresult(long id, int result) {
        return batchInputDao.updateCmfresult(id, result);
    }
}
