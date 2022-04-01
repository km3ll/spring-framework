package me.khazaddum.spring.m02.concept.c03_injection.impl;

import me.khazaddum.spring.m02.concept.c03_injection.IBookRepository;
import me.khazaddum.spring.m02.concept.c03_injection.IBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceViaSetterImpl implements IBookService {

	private static final Logger LOG = LoggerFactory.getLogger(BookServiceViaSetterImpl.class);

	private IBookRepository bookRepository;

	public BookServiceViaSetterImpl() {
		LOG.info("Created");
	}

	/*
	 * @Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER,
	 * ElementType.FIELD, ElementType.ANNOTATION_TYPE})
	 *
	 * @Retention(RetentionPolicy.RUNTIME)
	 *
	 * @Documented
	 */
	@Autowired
	public void setBookRepository(@Qualifier("bookRepositoryImplTwo") IBookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

}
