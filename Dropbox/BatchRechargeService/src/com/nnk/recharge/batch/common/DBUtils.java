package com.nnk.recharge.batch.common;

import com.nnk.dbsrv.DatabaseManager;

public class DBUtils {
    private static DatabaseManager ONLINE;
    private static DatabaseManager QUERY;
    
    private DBUtils() {
    }

    public static void initDB() {

        if (ONLINE == null) {
            synchronized (DBUtils.class) {
                if (ONLINE == null) {
                    ONLINE = new DatabaseManager("config/onlineDb.properties");
                    ONLINE.start();
                }
            }
        }
        if (QUERY == null) {
			synchronized (DBUtils.class) {
				if (QUERY == null) {
					QUERY = new DatabaseManager("config/queryDb.properties");
					QUERY.start();
				}
			}
		}
    }

    public static DatabaseManager getOnlineDb() {
        if (ONLINE == null) {
            initDB();
        }
        return ONLINE;
    }
    
    public static DatabaseManager getQueryDb() {
		if(QUERY == null){
			initDB();
		}
		return QUERY;
	}
}
