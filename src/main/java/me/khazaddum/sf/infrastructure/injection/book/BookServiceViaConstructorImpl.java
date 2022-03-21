package me.khazaddum.sf.infrastructure.injection.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceViaConstructorImpl implements IBookService {

	private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaConstructorImpl.class);

	private final BookRepository bookRepository;

	public BookServiceViaConstructorImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		LOG.info("Created");
	}

	@Override
	public Book save(Book book) {
		LOG.info("Book saved");
		return bookRepository.save(book);
	}

}
