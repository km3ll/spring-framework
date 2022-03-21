package erebor.spring.m01.app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationM01 {

	private static final Logger LOG = LoggerFactory.getLogger(ConfigurationM01.class);

	public ConfigurationM01() {
		LOG.info("Created");
	}

}
