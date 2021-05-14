package me.khazaddum.sf.infrastructure.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ProfileComponentA {

    private static final Logger LOG = LoggerFactory.getLogger(ProfileComponentA.class);

    public ProfileComponentA    () {
        LOG.info("Created");
    }

}
