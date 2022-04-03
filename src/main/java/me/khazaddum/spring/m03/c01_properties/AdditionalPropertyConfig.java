package me.khazaddum.spring.m03.c01_properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:additional.properties")
public class AdditionalPropertyConfig {

    private static final Logger LOG = LoggerFactory.getLogger(AdditionalPropertyConfig.class);

    @Value("${additional.info}")
    private String additionalInfo;

    public AdditionalPropertyConfig() {
        LOG.info("Created");
    }

    @PostConstruct
    private void postConstruct() {
        LOG.info("Additional info '{}'", additionalInfo);
    }

}
