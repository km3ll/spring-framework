package me.khazaddum.spring.m01.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	private static final Logger LOG = LoggerFactory.getLogger(Config.class);

	public Config() {
		LOG.info("Created");
	}

}
