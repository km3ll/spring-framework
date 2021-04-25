package me.khazaddum.sf.infrastructure.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BookServiceViaFieldImpl implements IBookService {

    private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaFieldImpl.class);

    private Book book;

    public BookServiceViaFieldImpl() {
        super();
        LOG.info("Creating BookServiceViaSetterImpl");
    }

    @Autowired
    public void setBook(Book book) {
        LOG.info("Setting Book");
        this.book = book;
    }

}
