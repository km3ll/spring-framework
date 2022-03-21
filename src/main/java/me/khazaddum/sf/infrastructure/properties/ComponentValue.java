package me.khazaddum.sf.infrastructure.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentValue {

	private static final Logger LOG = LoggerFactory.getLogger(ComponentValue.class);

	private String prefix;

	private String suffix;

	public ComponentValue(@Value("${sequence.prefix}") String prefix, @Value("${sequence.suffix}") String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
		LOG.info("Created with prefix '{}' and suffix '{}'", prefix, suffix);
	}

}
