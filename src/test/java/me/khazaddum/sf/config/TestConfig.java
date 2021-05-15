package me.khazaddum.sf.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.khazaddum.sf.infrastructure.testing")
public class TestConfig {

    private static final Logger LOG = LoggerFactory.getLogger(TestConfig.class);

    public TestConfig() {
        LOG.info("Created");
    }

}
