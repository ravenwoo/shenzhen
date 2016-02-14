package com.nnk.recharge.batch.dao.impl;

import com.nnk.recharge.batch.common.DBUtils;
import com.nnk.recharge.batch.dao.BatchInputExecuteDao;
import com.nnk.recharge.batch.dao.MyQueryBaseDao;
import com.nnk.recharge.batch.entity.db.BatchInputVo;
import org.apache.log4j.Logger;

/**
 * Created by wusz on 2015/12/30.
 */
public class BatchInputExecuteDaoImpl extends MyQueryBaseDao<BatchInputVo> implements BatchInputExecuteDao {
    private static final Logger logger = Logger.getLogger(BatchInputQueryDaoImpl.class);

    public BatchInputExecuteDaoImpl() {
        super(BatchInputVo.class, DBUtils.getOnlineDb());
    }

    @Override
    public int updateSendOrderIdById(long id, String sendOrderId) {

        String sql = "update BatchInput set sendorderid='" + sendOrderId + "' where id=" + id;

        logger.info("更新sendOrderId[SQL]: " + sql.toString());

        return super.executeUpdate(sql);
    }

    @Override
    public int updateCmfresult(long id, int result) {

        String sql = "update BatchInput set cmfresult=" + result + " where id=" + id;

        logger.info("更新cmfresult[SQL]: " + sql.toString());

        return super.executeUpdate(sql);
    }



    @Override
    public int updateComment(long id, String comment) {
        String sql = "update BatchInput set comment='" + comment + "' where id=" + id;

        logger.info("更新comment[SQL]: " + sql.toString());

        return super.executeUpdate(sql);
    }

    @Override
    public int updateOrderId(long id, String orderid) {
        String sql = "update BatchInput set orderid='" + orderid + "' where id=" + id;

        logger.info("更新orderid[SQL]: " + sql.toString());

        return super.executeUpdate(sql);
    }

}
