import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;

import java.util.HashMap;

/**
 * Created by %d{ISO8601}renzengtao on 2017/10/16.
 */
public class LogTest {
    public static Logger logger = LogManager.getLogger(LogTest.class.getName());

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try {
            Integer i = null;
            Integer xx = i + 9;
        } catch (Exception e) {
            HashMap map = new HashMap<String, String>();
            logger.error("fds", e);
        }

    }

}
