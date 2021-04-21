package me.khazaddum.sf.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanLazyComponent {

    private static final Logger log = LoggerFactory.getLogger(BeanLazyComponent.class);

    public BeanLazyComponent() {
        super();
        log.info("Creating BeanLazyComponent");
    }

}
