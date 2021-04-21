package me.khazaddum.sf.infrastructure.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanNoAnnotations {

    private static final Logger log = LoggerFactory.getLogger(BeanNoAnnotations.class);

    public BeanNoAnnotations() {
        super();
        log.info("Creating BeanNoAnnotations");
    }

}
