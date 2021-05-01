package me.khazaddum.sf.infrastructure.injection.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceViaFieldImpl implements IBookService {

    private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaFieldImpl.class);

    private BookRepository bookRepository;

    public BookServiceViaFieldImpl() {
        super();
        LOG.info("Created");
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        LOG.info("Autowired");
    }

    @Override
    public Book save(Book book) {
        LOG.info("Book saved");
        return bookRepository.save(book);
    }

}
