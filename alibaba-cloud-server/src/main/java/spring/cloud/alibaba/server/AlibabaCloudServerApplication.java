package spring.cloud.alibaba.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author pickjob@126.com
 * @Date 2020-10-19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudServerApplication.class, args);
    }
}
