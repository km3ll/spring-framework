package me.khazaddum.sf.infrastructure.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("dev")
public class LoggingModuleA {

	private static final Logger LOG = LoggerFactory.getLogger(LoggingModuleA.class);

	public LoggingModuleA() {
		LOG.debug("Created");
	}

	@PostConstruct
	public void postConstruct() {
		LOG.debug("Post construct called");
	}

}
