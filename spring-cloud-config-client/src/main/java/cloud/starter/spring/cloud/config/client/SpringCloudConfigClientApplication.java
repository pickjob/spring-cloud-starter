package cloud.starter.spring.cloud.config.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ws@yuan-mai.com
 * @Date 2020-11-04
 */
@SpringBootApplication
public class SpringCloudConfigClientApplication implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(SpringCloudConfigClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Spring cloud config client is running");
    }
}
