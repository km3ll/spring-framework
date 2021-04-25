package me.khazaddum.sf.infrastructure.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanLazyComponent {

    private static final Logger LOG = LoggerFactory.getLogger(BeanLazyComponent.class);

    public BeanLazyComponent() {
        super();
        LOG.info("Created");
    }

}
