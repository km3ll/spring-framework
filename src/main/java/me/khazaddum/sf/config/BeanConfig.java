package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.component.BeanNoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Mix and run multiple configurations: @Import({EmailConfig.class}) */
@Configuration
public class BeanConfig {

    private static final Logger LOG = LoggerFactory.getLogger(BeanConfig.class);

    public BeanConfig() {
        LOG.info("Created");
    }

    /* Method's name becomes bean's name */
    @Bean
    public BeanNoAnnotations beanNoAnnotations() {
        return new BeanNoAnnotations();
    }

}
