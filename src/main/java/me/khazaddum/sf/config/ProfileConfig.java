package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.profile.ProfileComponentC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    private static final Logger LOG = LoggerFactory.getLogger(ProfileConfig.class);

    public ProfileConfig() {
        LOG.info("Created");
    }

    @Bean
    @Profile("dev")
    public ProfileComponentC profileComponentC() {
        return new ProfileComponentC();
    }

}
