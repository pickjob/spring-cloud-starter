package cloud.starter.spring.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author pickjob@126.com
 * @Date 2020-11-13
 */
@RestController
public class NotFoundController {
    private static final String NOT_FOUND = "404";

    @GetMapping("/404")
    public String notFound() {
        return NOT_FOUND;
    }
}
