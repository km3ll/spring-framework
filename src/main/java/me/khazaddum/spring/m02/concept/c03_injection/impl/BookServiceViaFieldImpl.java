package me.khazaddum.spring.m02.concept.c03_injection.impl;

import me.khazaddum.spring.m02.concept.c03_injection.IBookRepository;
import me.khazaddum.spring.m02.concept.c03_injection.IBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceViaFieldImpl implements IBookService {

	private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaFieldImpl.class);

	@Autowired
	@Qualifier("bookRepositoryImplTwo")
	private IBookRepository bookRepository;

	public BookServiceViaFieldImpl() {
		LOG.info("Created");
	}

}
