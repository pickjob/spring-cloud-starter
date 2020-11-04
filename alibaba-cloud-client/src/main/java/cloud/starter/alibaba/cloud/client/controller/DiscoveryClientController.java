package cloud.starter.alibaba.cloud.client.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 *      Nacos 作为服务发现中间间，调用 Server 端服务
 * @Author pickjob@126.com
 * @Date 2020-10-19
 */
@RefreshScope
@RequestMapping("/discovery")
@RestController
public class DiscoveryClientController {
    private static final Logger logger = LogManager.getLogger(DiscoveryClientController.class);
    @Value("${alibaba.cloud.server}")
    private String SERVER_NAME;
    @Autowired private RestTemplate restTemplate;

    @GetMapping
    public String echo(String name) {
        // Access through the combination of LoadBalanceClient and RestTemplate
        String path = String.format("http://%s/discovery?name=%s", SERVER_NAME, name);
        return restTemplate.getForObject(path, String.class);
    }
}
