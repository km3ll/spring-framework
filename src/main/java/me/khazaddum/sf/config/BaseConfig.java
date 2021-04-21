package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.component.BeanNoAnnotations;
import me.khazaddum.sf.infrastructure.hooks.BeanHooksNoAnnotation;
import me.khazaddum.sf.infrastructure.hooks.BeanHooksWithAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Mix and run multiple configurations: @Import({EmailConfig.class}) */
@Configuration
public class BaseConfig {

    private static final Logger log = LoggerFactory.getLogger(BaseConfig.class);

    public BaseConfig() {
        super();
        log.info("Creating BaseConfig");
    }

    /* Method's name becomes bean's name */
    @Bean
    public BeanNoAnnotations beanNoAnnotations() {
        return new BeanNoAnnotations();
    }

    @Bean
    public BeanHooksWithAnnotation beanPostConstructWithAnnotation() {
        return new BeanHooksWithAnnotation();
    }

    @Bean(initMethod = "initialize", destroyMethod = "finalize")
    public BeanHooksNoAnnotation beanPostConstructNoAnnotation() {
        return new BeanHooksNoAnnotation();
    }

}
