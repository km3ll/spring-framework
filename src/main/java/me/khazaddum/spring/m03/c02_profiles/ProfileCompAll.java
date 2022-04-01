package me.khazaddum.spring.m03.c02_profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
// @Profile()
// If a bean is not annotated with @Profile, it will be enabled with all profiles.
public class ProfileCompAll {

	private static final Logger LOG = LoggerFactory.getLogger(ProfileCompAll.class);

	public ProfileCompAll() {
		LOG.info("Created");
	}

}
