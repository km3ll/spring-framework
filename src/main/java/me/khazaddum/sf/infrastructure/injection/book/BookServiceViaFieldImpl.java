package me.khazaddum.sf.infrastructure.injection.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceViaFieldImpl implements IBookService {

    private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaFieldImpl.class);

    private Book book;

    public BookServiceViaFieldImpl() {
        super();
        LOG.info("Created");
    }

    @Autowired
    public void setBook(Book book) {
        this.book = book;
        LOG.info("Autowired");
    }

}
