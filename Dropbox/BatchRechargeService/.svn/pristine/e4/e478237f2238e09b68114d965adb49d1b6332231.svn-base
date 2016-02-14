package com.nnk.recharge.batch.config;

import com.nnk.recharge.batch.common.YhbfShell;

import static com.nnk.recharge.batch.config.LoadConfig.SYSTEM_CONFIG_PROPERTIES;

/**
 * Created by wusz on 2015/12/23.
 */
public class SystemConstant {

    /**
     * 系统间隔多久执行一次检查任务，检查需要执行哪些任务(数据库)
     * The constant AUTO_CHECK_TIME.
     */
    public static final int AUTO_CHECK_DATABASE_TIME = Integer.parseInt(SYSTEM_CONFIG_PROPERTIES.get("AutoCheckDatabaseTime"));
    /**
     * 系统间隔多久执行一次检查任务，检查需要执行哪些任务(内存)
     * The constant AUTO_CHECK_TIME.
     */
    public static final int AUTO_CHECK_CACHE_TIME = Integer.parseInt(SYSTEM_CONFIG_PROPERTIES.get("AutoCheckCacheTime"));

    /**
     * 批充线程池大小
     * The constant THREADPOOL_SIZE.
     */
    public static final int THREADPOOL_SIZE = Integer.parseInt(SYSTEM_CONFIG_PROPERTIES.get("ThreadPoolSize"));
    /**
     * yhbf路径
     * The constant SECURITY_PROGRAM_PATH.
     */
    public static final String SECURITY_PROGRAM_PATH = SYSTEM_CONFIG_PROPERTIES.get("SecurityProgramPath");
    /**
     * 系统一次加载多少条任务进行批充处理
     * The constant EACH_TASK_AMOUNT.
     */
    public static final int EACH_TASK_AMOUNT = Integer.parseInt(SYSTEM_CONFIG_PROPERTIES.get("EachTaskAmount"));
    /**
     * 系统merid，用于发往OrderIdSystem生成订单号
     * The constant PROTOCOL_ORDERIDSYSTEM_MERID.
     */
    public static final String PROTOCOL_ORDERIDSYSTEM_MERID = SYSTEM_CONFIG_PROPERTIES.get("OrderIdSystemMerid");
    /**
     * OrderIdSystem生成订单号程序appName
     * The constant PROTOCOL_ORDERIDSYSTEM_APPNAME.
     */
    public static final String PROTOCOL_ORDERIDSYSTEM_APPNAME = SYSTEM_CONFIG_PROPERTIES.get("OrderIdSystemAppName");

    /**
     * OrderIdSystem生成订单号程序命令
     * The constant PROTOCOL_ORDERIDSYSTEM_COMMAND.
     */
    public static final String PROTOCOL_ORDERIDSYSTEM_COMMAND = SYSTEM_CONFIG_PROPERTIES.get("OrderIdSystemCommand");

    /**
     * 协议签名验证key
     * The constant PROTOCOL_SIGN_KEY.
     */
    public static final String PROTOCOL_SIGN_KEY = YhbfShell.decoder(SYSTEM_CONFIG_PROPERTIES.get("ProtocolSingKey"));

    /**
     * 协议返回异常重发次数
     * The constant PROTOCOL_RESEND_TIMES.
     */
    public static final int PROTOCOL_RESEND_TIMES = Integer.parseInt(SYSTEM_CONFIG_PROPERTIES.get("ProtocolReSendTimes"));

    /**
     * #短连接等待时间
     * The constant WAIT_TIME_MILLISECOND.
     */
    public static final int WAIT_TIME_MILLISECOND = Integer.parseInt(SYSTEM_CONFIG_PROPERTIES.get("WaitTimeMillisecond"));

    /**
     * 订单生成URLEncoder
     * The constant PROTOCOL_ORDERIDSYSTEM_URL_ENCODER.
     */
    public static final String PROTOCOL_ORDERIDSYSTEM_URL_ENCODER = SYSTEM_CONFIG_PROPERTIES.get("OrderIdSystemUrlEncoder");

    /**
     * 充值指令AppName
     * The constant PROTOCOL_RECHARGE_APPNAME.
     */
    public static final String PROTOCOL_RECHARGE_APPNAME = SYSTEM_CONFIG_PROPERTIES.get("RechargeAppName");

    /**
     * 充值指令Command
     * The constant PROTOCOL_RECHARGE_COMMAND.
     */
    public static final String PROTOCOL_RECHARGE_COMMAND = SYSTEM_CONFIG_PROPERTIES.get("RechargeCommand");


}
