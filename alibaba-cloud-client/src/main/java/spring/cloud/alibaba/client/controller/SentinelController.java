package spring.cloud.alibaba.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author pickjob@126.com
 * @Date 2020-10-20
 */
@RequestMapping("/sentinel")
@RestController
public class SentinelController {

    @GetMapping
    public String sentinelResource (String name) {
        return String.format("hello, %s", name);
    }
}
