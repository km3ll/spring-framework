package me.khazaddum.sf.infrastructure.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanNoAnnotations {

    private static final Logger LOG = LoggerFactory.getLogger(BeanNoAnnotations.class);

    public BeanNoAnnotations() {
        super();
        LOG.info("Creating BeanNoAnnotations");
    }

}
