package me.khazaddum.spring.m02.concept.c01_component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyComponent {

	private static final Logger LOG = LoggerFactory.getLogger(LazyComponent.class);

	public LazyComponent() {
		LOG.info("Created");
	}

}
