package me.khazaddum.sf.infrastructure.injection.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepositoryBImpl implements IAuthorRepository {

	private static final Logger LOG = LoggerFactory.getLogger(AuthorRepositoryBImpl.class);

	public AuthorRepositoryBImpl() {
		super();
		LOG.info("Created");
	}

}
