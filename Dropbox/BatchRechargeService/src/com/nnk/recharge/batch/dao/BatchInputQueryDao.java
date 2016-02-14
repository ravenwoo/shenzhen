package com.nnk.recharge.batch.dao;

import com.nnk.recharge.batch.entity.db.BatchInputVo;

import java.util.List;

/**
 * Created by wusz on 2015/12/23.
 */
public interface BatchInputQueryDao {

    /**
     * Gets batch input by batch no.
     *
     * @param batchNo the batch no
     * @return the batch input by batch no
     */
    List<BatchInputVo> getBatchInputByBatchNo(long batchNo, long limit);

    /**
     * Is all success list.
     *
     * @param batchNo the batch no
     * @return the list
     */
    List<BatchInputVo> isAllSuccess(long batchNo);
}
