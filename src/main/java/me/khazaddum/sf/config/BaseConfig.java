package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.component.BeanNoAnnotations;
import me.khazaddum.sf.infrastructure.hooks.BeanHooksNoAnnotation;
import me.khazaddum.sf.infrastructure.hooks.BeanHooksWithAnnotation;
import me.khazaddum.sf.infrastructure.injection.book.BookServiceViaFieldImpl;
import me.khazaddum.sf.infrastructure.injection.book.BookServiceViaSetterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Mix and run multiple configurations: @Import({EmailConfig.class}) */
@Configuration
public class BaseConfig {

    private static final Logger LOG = LoggerFactory.getLogger(BaseConfig.class);

    public BaseConfig() {
        LOG.info("Created");
    }

}
