package me.khazaddum.spring.m03.c02_profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import javax.annotation.PostConstruct;

@Configuration
public class ProfileConfig {

	private static final Logger LOG = LoggerFactory.getLogger(ProfileConfig.class);

	@Autowired
	private Environment environment;

	public ProfileConfig() {
		LOG.info("Created");
	}

	@Bean
	@Profile("dev")
	public ProfileComp devProfileComp() {
		LOG.info("Returning ProfileComp bean for 'dev' profile");
		return new ProfileComp("dev");
	}

	@Bean
	@Profile("prod")
	public ProfileComp prodProfileComp() {
		LOG.info("Returning ProfileComp bean for 'prod' profile");
		return new ProfileComp("prod");
	}

	@PostConstruct
	void postConstruct() {
		LOG.info("Active profiles: {}", environment.getActiveProfiles());
		LOG.info("Default profiles: {}", environment.getDefaultProfiles());
	}

}
