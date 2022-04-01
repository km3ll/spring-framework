package me.khazaddum.spring.m02.concept.c03_injection.impl;

import me.khazaddum.spring.m02.concept.c03_injection.IBookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImplOne implements IBookRepository {

	private static final Logger LOG = LoggerFactory.getLogger(BookRepositoryImplOne.class);

	public BookRepositoryImplOne() {
		LOG.info("Created");
	}

}
