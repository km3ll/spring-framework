package me.khazaddum.sf.infrastructure.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContextAwareComponent implements ApplicationContextAware {

    private static final Logger LOG = LoggerFactory.getLogger(ContextAwareComponent.class);

    public ContextAwareComponent() {
        LOG.info("Created");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOG.info("Context with id '{}' set", applicationContext.getId());
    }

}
