package me.khazaddum.sf.infrastructure.injection.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements ILibraryService {

	private static final Logger LOG = LoggerFactory.getLogger(LibraryServiceImpl.class);

	private IAuthorRepository authorRepository;

	private ICategoryRepository categoryRepository;

	/*
	 * @Qualifier("authorRepositoryAImpl"). This annotation fixes error: Parameter 0 of
	 * constructor in LibraryServiceImpl required a single bean, but 2 were found
	 */
	public LibraryServiceImpl(@Qualifier("authorRepositoryAImpl") IAuthorRepository authorRepository,
			ICategoryRepository categoryRepository) {

		this.authorRepository = authorRepository;
		this.categoryRepository = categoryRepository;

		LOG.info("Created");

	}

}
