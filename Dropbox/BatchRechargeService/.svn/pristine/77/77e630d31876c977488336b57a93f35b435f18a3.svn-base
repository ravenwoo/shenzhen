package com.nnk.recharge.batch.dao;

import com.nnk.dbsrv.DatabaseManager;
import com.nnk.dbsrv.dao.BaseDao;

import java.util.List;
import java.util.Map;

public class MyQueryBaseDao<T> extends BaseDao<T> {

    public MyQueryBaseDao(Class<T> type, DatabaseManager dbManager) {
        super(type, dbManager);
    }

    @Override
    public List<Map<String, String>> excuteQuery(String arg0) {
        try {
            return super.excuteQuery(arg0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int executeInsert(String sql) {
        try {
            return super.executeInsert(sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int executeUpdate(String sql) {
        try {
            return super.executeUpdate(sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<T> find(String sql) {
        try {
            return super.find(sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T get(String sql) {
        try {
            return super.get(sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
