package me.khazaddum.spring.m03.c01_properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class EnvironmentComp {

	private static final Logger LOG = LoggerFactory.getLogger(EnvironmentComp.class);

	@Autowired
	private Environment environment;

	public EnvironmentComp() {
		LOG.info("Created");
	}

	@PostConstruct
	private void postConstruct() {
		LOG.info("Prefix value '{}'", environment.getProperty("m03.c01.prefix"));
		LOG.info("Active profiles: ");
		Arrays.stream(environment.getActiveProfiles()).forEach(LOG::info);
	}

}
