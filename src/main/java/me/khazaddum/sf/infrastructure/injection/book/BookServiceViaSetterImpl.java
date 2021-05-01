package me.khazaddum.sf.infrastructure.injection.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceViaSetterImpl implements IBookService {

    private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaSetterImpl.class);

    @Autowired
    private BookRepository bookRepository;

    public BookServiceViaSetterImpl() {
        super();
        LOG.info("Created");
    }

    @Override
    public Book save(Book book) {
        LOG.info("Book saved");
        return bookRepository.save(book);
    }

}