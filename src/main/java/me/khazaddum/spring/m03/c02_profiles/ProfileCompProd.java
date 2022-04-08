package me.khazaddum.spring.m03.c02_profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProfileCompProd {

	private static final Logger LOG = LoggerFactory.getLogger(ProfileCompProd.class);

	public ProfileCompProd() {
		LOG.info("Created");
	}

}
