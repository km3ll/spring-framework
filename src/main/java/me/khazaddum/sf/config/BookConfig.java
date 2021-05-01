package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.injection.book.BookServiceViaFieldImpl;
import me.khazaddum.sf.infrastructure.injection.book.BookServiceViaSetterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    private static final Logger LOG = LoggerFactory.getLogger(BookConfig.class);

    public BookConfig() {
        LOG.info("Created");
    }

    @Bean
    public BookServiceViaSetterImpl bookServiceViaSetter() {
        return new BookServiceViaSetterImpl();
    }

    @Bean
    public BookServiceViaFieldImpl bookServiceViaField() {
        return new BookServiceViaFieldImpl();
    }

}
