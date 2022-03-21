package me.khazaddum.spring.m01.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class M01Config {

	private static final Logger LOG = LoggerFactory.getLogger(M01Config.class);

	public M01Config() {
		LOG.info("Created");
	}

}
