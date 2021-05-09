package me.khazaddum.sf.infrastructure.context.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BasicComponent {

    private static final Logger LOG = LoggerFactory.getLogger(BasicComponent.class);

    public BasicComponent() {
        LOG.info("Created");
    }

    @PostConstruct
    public void postConstruct() {
        LOG.info("postConstruct called");
    }

    @PreDestroy
    public void preDestroy() {
        LOG.info("preDestroy called");
    }

}
