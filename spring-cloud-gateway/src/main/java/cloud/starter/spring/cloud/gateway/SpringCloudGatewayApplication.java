package cloud.starter.spring.cloud.gateway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author pickjob@126.com
 * @Date 2020-11-10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudGatewayApplication implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(SpringCloudGatewayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Spring cloud gateway is running...");
    }
}
