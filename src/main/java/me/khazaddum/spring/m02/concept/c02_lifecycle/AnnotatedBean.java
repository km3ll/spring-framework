package me.khazaddum.spring.m02.concept.c02_lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotatedBean {

	private static final Logger LOG = LoggerFactory.getLogger(AnnotatedBean.class);

	public AnnotatedBean() {
		LOG.info("Created");
	}

	@PostConstruct
	public void postConstruct() {
		LOG.info("Called: postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		LOG.info("Called: preDestroy	");
	}

}
