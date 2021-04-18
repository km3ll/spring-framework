package me.khazaddum.sf.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {

    private static final Logger log = LoggerFactory.getLogger(EmailConfig.class);

    public EmailConfig() {
        super();
        log.info("Creating EmailConfig");
    }

}
