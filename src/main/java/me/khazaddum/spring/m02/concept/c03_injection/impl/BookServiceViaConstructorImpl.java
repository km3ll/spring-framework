package me.khazaddum.spring.m02.concept.c03_injection.impl;

import me.khazaddum.spring.m02.concept.c03_injection.IBookRepository;
import me.khazaddum.spring.m02.concept.c03_injection.IBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookServiceViaConstructorImpl implements IBookService {

	private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaConstructorImpl.class);

	private IBookRepository bookRepository;

	public BookServiceViaConstructorImpl(IBookRepository bookRepository) {
		this.bookRepository = bookRepository;
		LOG.info("Created");
	}

}
