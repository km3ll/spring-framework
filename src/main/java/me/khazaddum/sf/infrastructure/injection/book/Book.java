package me.khazaddum.sf.infrastructure.injection.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Book {

    private static final Logger LOG = LoggerFactory.getLogger(Book.class);

    public Book() {
        super();
        LOG.info("Created");
    }

}
