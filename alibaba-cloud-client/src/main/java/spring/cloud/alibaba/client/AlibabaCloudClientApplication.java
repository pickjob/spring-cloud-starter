package spring.cloud.alibaba.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author pickjob@126.com
 * @Date 2020-10-19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaCloudClientApplication implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(AlibabaCloudClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("AlibabaCloudClientApplication is running ...");
    }
}
