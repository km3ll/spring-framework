package me.khazaddum.spring.m01.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class M01Configuration {

	private static final Logger LOG = LoggerFactory.getLogger(M01Configuration.class);

	public M01Configuration() {
		LOG.info("Created");
	}

}
