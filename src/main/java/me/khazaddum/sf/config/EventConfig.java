package me.khazaddum.sf.config;

import me.khazaddum.sf.service.impl.MetricsServiceNoAnnotationImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({EmailConfig.class})
public class EventConfig {

    private static final Logger log = LoggerFactory.getLogger(EventConfig.class);

    public EventConfig() {
        super();
        log.info("Creating EventConfig");
    }

    @Bean
    public MetricsServiceNoAnnotationImpl metricsServiceNoAnnotation() {
        return new MetricsServiceNoAnnotationImpl();
    }

}
