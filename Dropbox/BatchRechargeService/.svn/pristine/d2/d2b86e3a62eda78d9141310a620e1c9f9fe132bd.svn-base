package com.nnk.recharge.batch.service;

import nnk.msgsrv.server.MsgSrvLongConnector;

/**
 * Created by wusz on 2015/12/28.
 */
public class MsgSrvService {
    private static final MsgSrvLongConnector msgSrvConnectorSZNNK = new MsgSrvLongConnector("config/msgsrv-long.xml");

    public static void start() {
        msgSrvConnectorSZNNK.start();
    }

    public static void sendSZNNK(String message) {
        msgSrvConnectorSZNNK.getConnector().send(message);
    }

    public static void isConnected() {
        msgSrvConnectorSZNNK.getConnector().isConnected();
    }

}
