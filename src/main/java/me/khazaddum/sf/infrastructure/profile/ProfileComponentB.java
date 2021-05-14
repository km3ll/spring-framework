package me.khazaddum.sf.infrastructure.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProfileComponentB {

    private static final Logger LOG = LoggerFactory.getLogger(ProfileComponentB.class);

    public ProfileComponentB() {
        LOG.info("Created");
    }

}
