package me.khazaddum.sf.infrastructure.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Enumeration;
import java.util.Properties;

@Component
public class ComponentSystem {

	private static final Logger LOG = LoggerFactory.getLogger(ComponentSystem.class);

	public ComponentSystem() {

		LOG.info("Created");

		// 1. Properties
		Properties properties = System.getProperties();
		Enumeration keys = properties.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = (String) properties.getProperty(key);
			// LOG.info("Property key={}, value={}", key, value);
		}

		// Defining a default value '/tmp/log' when not found
		// String log_dir = System.getProperty("log_dir","/tmp/log");

		String propKey = "java.runtime.version";
		String propValue = (String) System.getProperties().get(propKey);

		LOG.info("Property key={}, value={}", propKey, propValue);

		// 2. Environment Variables
		System.getenv().forEach((k, v) -> {
			// LOG.info("Variable: key={}, value={}", k, v);
		});

		String varKey = "PATH";
		String varValue = System.getenv(varKey);
		LOG.info("Variable key={}, value={}", varKey, varValue);

	}

}
