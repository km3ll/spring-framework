package me.khazaddum.spring.m02.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Basic {

	private static final Logger LOG = LoggerFactory.getLogger(Basic.class);

	public Basic() {
		LOG.info("Created");
	}

}