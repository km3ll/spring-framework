package me.khazaddum.sf.infrastructure.hooks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanHooksNoAnnotation {

    private static final Logger log = LoggerFactory.getLogger(BeanHooksNoAnnotation.class);

    public void initialize() {
        log.info("PostConstruct hook with no annotation");
    }

    public void finalize() {
        log.info("PreDestroy hook with no annotation");
    }

}
