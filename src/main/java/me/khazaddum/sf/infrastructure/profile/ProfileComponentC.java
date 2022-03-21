package me.khazaddum.sf.infrastructure.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public class ProfileComponentC {

	private static final Logger LOG = LoggerFactory.getLogger(ProfileComponentC.class);

	public ProfileComponentC() {
		LOG.info("Created");
	}

}
