package spring.cloud.alibaba.server.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.alibaba.server.util.ExceptionUtils;

/**
 * @Description:
 *      Sentinal 作为流控框架对请求进行拦截
 * @Author pickjob@126.com
 * @Date 2020-10-20
 */
@RequestMapping("/sentinel")
@RestController
public class SentinelController {
    private static final Logger logger = LogManager.getLogger(SentinelController.class);
    private static final String SENTINEL_RESOURCE = "Common sentinel resource.";

    @SentinelResource(value = "sentinelResource", blockHandler = "handleBlockException", blockHandlerClass = ExceptionUtils.class)
    @GetMapping
    public String sentinelResource () {
        logger.info(SENTINEL_RESOURCE);
        return SENTINEL_RESOURCE;
    }
}
