package cloud.starter.alibaba.cloud.client.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 *      动态刷新配置   @RefreshScope
 * @Author pickjob@126.com
 * @Date 2020-10-27
 */
@RefreshScope
@RequestMapping("/config")
@RestController
public class ConfigController {
    private static final Logger logger = LogManager.getLogger(ConfigController.class);
    @Value("${author.name}")
    private String authorName;

    @GetMapping
    public String get() {
        return authorName;
    }
}
