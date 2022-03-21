package me.khazaddum.spring.m02.concept.c01_component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BasicComponent {

	private static final Logger LOG = LoggerFactory.getLogger(BasicComponent.class);

	public BasicComponent() {
		LOG.info("Created");
	}

}
