package me.khazaddum.spring.m03.c05_testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.khazaddum.spring.m03.c05_testing")
public class ValidatorConfig {

	private static final Logger LOG = LoggerFactory.getLogger(ValidatorConfig.class);

	public ValidatorConfig() {
		LOG.info("Created");
	}

}
