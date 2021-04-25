package me.khazaddum.sf.infrastructure.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookServiceViaConstructorImpl implements IBookService {

    private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaConstructorImpl.class);

    private final Book book;

    public BookServiceViaConstructorImpl(Book book) {
        LOG.info("Creating BookServiceViaConstructorImpl");
        this.book = book;
    }

}
