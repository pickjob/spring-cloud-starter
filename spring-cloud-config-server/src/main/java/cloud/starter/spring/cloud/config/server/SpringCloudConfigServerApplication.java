package cloud.starter.spring.cloud.config.server;

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
public class SpringCloudConfigServerApplication implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(SpringCloudConfigServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Spring cloud config server is running ...");
    }
}
