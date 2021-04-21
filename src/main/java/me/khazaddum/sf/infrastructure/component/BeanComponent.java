package me.khazaddum.sf.infrastructure.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanComponent {

    private static final Logger log = LoggerFactory.getLogger(BeanComponent.class);

    public BeanComponent() {
        super();
        log.info("Creating BeanComponent");
    }

}
