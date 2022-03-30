package me.khazaddum.spring.m02.concept.c05_context.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class ContextServiceImpl implements IContextService, ApplicationContextAware {

	private static final Logger LOG = LoggerFactory.getLogger(ContextServiceImpl.class);

	public ContextServiceImpl() {
		LOG.info("Created");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		LOG.info("Context with ID '{}' set", applicationContext.getId());
	}

	@PostConstruct
	public void postConstruct() {
		LOG.info("PostConstruct called");
	}

	@PreDestroy
	public void preDestroy() {
		LOG.info("PreDestroy called");
	}

}
