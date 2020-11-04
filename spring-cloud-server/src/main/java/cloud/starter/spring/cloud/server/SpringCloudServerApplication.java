package cloud.starter.spring.cloud.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author pickjob@126.com
 * @Date 2020-10-21
 */
@EnableConfigServer
@SpringBootApplication
public class SpringCloudServerApplication implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(SpringCloudServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Spring cloud server is running ...");
    }
}
