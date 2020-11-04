package cloud.starter.alibaba.cloud.server.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 *      Nacos 作为服务发现中间间，发布服务 (与普通http服务无区别，在于主机发现，主机调用)
 * @Author pickjob@126.com
 * @Date 2020-10-19
 */
@RequestMapping("/discovery")
@RestController
public class DiscoverServerController {
    private static final Logger logger = LogManager.getLogger(DiscoverServerController.class);

    @GetMapping
    public String discoveryResource(String name) {
        logger.info("server discover {}", name);
        return String.format("hello, %s", name);
    }
}
