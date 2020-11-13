package cloud.starter.spring.cloud.service.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ws@yuan-mai.com
 * @Date 2020-11-12
 */
@RequestMapping("/v1/downstream")
@RestController
public class DownstreamController {
    private static final Logger logger = LogManager.getLogger(DownstreamController.class);
    private static final String DOWN_STREAM_ECHO_HELLO = "Hello from downstream !";

    @GetMapping
    public String queryDownstream() {
        return DOWN_STREAM_ECHO_HELLO;
    }
}
