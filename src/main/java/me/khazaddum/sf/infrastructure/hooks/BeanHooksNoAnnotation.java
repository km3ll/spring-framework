package me.khazaddum.sf.infrastructure.hooks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanHooksNoAnnotation {

    private static final Logger LOG = LoggerFactory.getLogger(BeanHooksNoAnnotation.class);

    public void initialize() {
        LOG.info("PostConstruct hook called");
    }

    public void finalize() {
        LOG.info("PreDestroy hook called");
    }

}
