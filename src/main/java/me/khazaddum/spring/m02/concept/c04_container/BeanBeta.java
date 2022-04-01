package me.khazaddum.spring.m02.concept.c04_container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

public class BeanBeta {

	private static final Logger LOG = LoggerFactory.getLogger(BeanBeta.class);

	private String status;

	public BeanBeta() {
		LOG.info("Created");
	}

	@PostConstruct
	public void postConstruct() {
		LOG.info("Value of the property status is: {}", this.status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
