package me.khazaddum.sf.infrastructure.injection.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private static final Logger LOG = LoggerFactory.getLogger(BookRepository.class);

    private List<Book> books = new ArrayList<>();

    public BookRepository() {
        super();
        LOG.info("Created");
    }

    public Book save(Book book) {
        books.add(book);
        LOG.info("Book saved");
        return book;
    }

}
