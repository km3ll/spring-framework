package me.khazaddum.sf.infrastructure.hooks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanHooksWithAnnotation {

    private static final Logger log = LoggerFactory.getLogger(BeanHooksWithAnnotation.class);

    @PostConstruct
    public void postConstruct() {
        log.info("PostConstruct hook with annotation");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("PreDestroy hook with annotation");
    }

}
