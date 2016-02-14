import com.nnk.recharge.batch.service.BatchRechargeService;
import com.nnk.recharge.batch.service.MsgSrvService;
import org.apache.log4j.Logger;

/**
 * The type Main.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // 启动消息服务器客户端
        MsgSrvService.start();
        logger.info("启动批量充值服务程序...");
        new BatchRechargeService().start();
    }
}
