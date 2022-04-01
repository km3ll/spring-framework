package me.khazaddum.spring.m03.c01_properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PropertyComp {

	private final String prefix;

	private final Integer suffix;

	private static final Logger LOG = LoggerFactory.getLogger(PropertyComp.class);

	public PropertyComp(@Value("${m03.c01.prefix}") String prefix, @Value("${m03.c01.suffix}") Integer suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
		LOG.info("Created");
	}

	@PostConstruct
	private void postConstruct() {
		LOG.info("Using prefix '{}' and suffix '{}'", this.prefix, this.suffix);
	}

}
