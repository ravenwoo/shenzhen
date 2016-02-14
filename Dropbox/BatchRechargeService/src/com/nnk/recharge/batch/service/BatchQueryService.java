package com.nnk.recharge.batch.service;

import com.nnk.recharge.batch.entity.db.BatchVo;

import java.util.List;

/**
 * Created by wusz on 2015/12/23.
 */
public interface BatchQueryService {

    /**
     * Gets recharge task.
     *
     * @param status the status
     * @return the recharge task
     */
    List<BatchVo> getRechargeTask(int status);

    /**
     * Gets recharge task.
     *
     * @param id the id
     * @return the recharge task
     */
    BatchVo getRechargeTask(long id);


}
