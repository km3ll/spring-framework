package me.khazaddum.sf.infrastructure.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ComponentEnvironment {

    private static final Logger LOG = LoggerFactory.getLogger(ComponentEnvironment.class);

    //@Autowired
    private Environment environment;

    //@Value("${sequence.prefix}")
    private String prefix;

    //@Value("${sequence.suffix}")
    private String suffix;

    public ComponentEnvironment( @Autowired Environment environment) {

        this.environment = environment;
        this.prefix = environment.getProperty("sequence.prefix");
        this.suffix = environment.getProperty("sequence.suffix");

        LOG.info("Created with prefix '{}' and suffix '{}' from environment", prefix, suffix);

    }

}
