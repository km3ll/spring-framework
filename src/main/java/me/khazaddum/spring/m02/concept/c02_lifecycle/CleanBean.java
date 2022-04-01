package me.khazaddum.spring.m02.concept.c02_lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CleanBean {

	private static final Logger LOG = LoggerFactory.getLogger(CleanBean.class);

	public CleanBean() {
		LOG.info("Created");
	}

	public void initialize() {
		LOG.info("Called: initialize");
	}

	public void destroy() {
		LOG.info("Called: destroy");
	}

}
