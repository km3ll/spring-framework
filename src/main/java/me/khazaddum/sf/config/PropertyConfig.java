package me.khazaddum.sf.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@PropertySource("classpath:additional.properties")
@Configuration
public class PropertyConfig {

    private static final Logger LOG = LoggerFactory.getLogger(PropertyConfig.class);

    @Value("${additional.info}")
    private String additionalMsg;

    public PropertyConfig() {
        LOG.info("Created");
    }

    @PostConstruct
    public void postConstruct() {
        LOG.info("Additional property: '{}'", additionalMsg);
    }

}
