package me.khazaddum.spring.m03.c01_properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Properties;

@Component
public class PropertySourceComp {

	private static final Logger LOG = LoggerFactory.getLogger(PropertySourceComp.class);

	public PropertySourceComp() {
		LOG.info("Created");
	}

	@PostConstruct
	private void postConstruct() {

		Properties properties = System.getProperties();
		LOG.info("System properties: {}", properties);

		Map<String, String> variables = System.getenv();
		LOG.info("Environment variables: {}", variables);

	}

}
