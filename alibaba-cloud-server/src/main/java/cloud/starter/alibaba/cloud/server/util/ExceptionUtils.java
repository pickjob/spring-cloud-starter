package cloud.starter.alibaba.cloud.server.util;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Author pickjob@126.com
 * @Date 2020-10-28
 */
public class ExceptionUtils {
    private static final Logger logger = LogManager.getLogger(ExceptionUtils.class);
    private static final String SENTINEL_RESOURCE_FLOW_CONTROL = "Sentinel resource flow control!!";
    private static final String SENTINEL_RESOURCE_FALLBACK_CONTROL = "Sentinel resource fallback control!!";

    public static String handleBlockException(BlockException exception) {
        return SENTINEL_RESOURCE_FLOW_CONTROL;
    }

    public static String handleFallbackException(Throwable throwable) {
        logger.error(throwable.getMessage(), throwable);
        return SENTINEL_RESOURCE_FALLBACK_CONTROL;
    }
}
