package com.nnk.recharge.batch.dao.impl;

import com.nnk.recharge.batch.common.DBUtils;
import com.nnk.recharge.batch.dao.BatchInputQueryDao;
import com.nnk.recharge.batch.dao.MyQueryBaseDao;
import com.nnk.recharge.batch.entity.db.BatchInputVo;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

/**
 * Created by wusz on 2015/12/23.
 */
public class BatchInputQueryDaoImpl extends MyQueryBaseDao<BatchInputVo> implements BatchInputQueryDao {

    private static final Logger logger = Logger.getLogger(BatchInputQueryDaoImpl.class);

    public BatchInputQueryDaoImpl() {
        super(BatchInputVo.class, DBUtils.getQueryDb());
    }

    @Override
    public List<BatchInputVo> getBatchInputByBatchNo(long batchNo,long limit) {

        StringBuilder sql = new StringBuilder();
        sql.append("select id,batchno,merid,meraccount,type,mob,value,cardsn,cdkey,cardtype,cardid,timeout,orderid,sendorderid,cmfresult from BatchInput ");
        sql.append(" where batchno=" + batchNo);
        sql.append(" and cmfresult in (0,1,2)");
        sql.append(" order by id limit " + limit);
        logger.info("查询批次详情[SQL]: " + sql.toString());
        List<BatchInputVo> batchInputVos = super.find(sql.toString());
        if (batchInputVos == null) {
            return Collections.emptyList();
        }
        return batchInputVos;
    }

    @Override
    public List<BatchInputVo> isAllSuccess(long batchNo) {

        String sql = "select id from BatchInput where batchno=" + batchNo + " and cmfresult=99";
        List<BatchInputVo> batchInputVos = super.find(sql.toString());
        if (batchInputVos == null) {
            return Collections.emptyList();
        }
        return batchInputVos;
    }

}
