package me.khazaddum.spring.m03.c02_profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProfileComp {

	private static final Logger LOG = LoggerFactory.getLogger(ProfileComp.class);

	private String profile;

	public ProfileComp(String profile) {
		this.profile = profile;
		LOG.info("Created");
	}

}
