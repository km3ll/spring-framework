package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.hooks.BeanHooksNoAnnotation;
import me.khazaddum.sf.infrastructure.hooks.BeanHooksWithAnnotation;
import me.khazaddum.sf.infrastructure.injection.pet.OwnerRepository;
import me.khazaddum.sf.infrastructure.injection.pet.PetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanHooksConfig {

    private static final Logger LOG = LoggerFactory.getLogger(BeanHooksConfig.class);

    public BeanHooksConfig() {
        LOG.info("Created");
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
