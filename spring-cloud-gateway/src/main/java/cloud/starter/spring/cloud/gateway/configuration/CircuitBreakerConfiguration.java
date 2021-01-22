package cloud.starter.spring.cloud.gateway.configuration;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author pickjob@126.com
 * @Date 2021-01-22
 */
@Configuration
public class CircuitBreakerConfiguration {
    private static final Logger logger = LogManager.getLogger(CircuitBreakerConfiguration.class);

    @Bean
    public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
        return factory -> factory.configureDefault(id -> {
            logger.info("customizer circuitBreaker id: {}", id);
            return new Resilience4JConfigBuilder(id)
                    .circuitBreakerConfig(
                            CircuitBreakerConfig.custom()
                                    .slidingWindowSize(10)
                                    .failureRateThreshold(1)
                                    .minimumNumberOfCalls(1)
                                    .build())
                    .build();
        });
    }
}
