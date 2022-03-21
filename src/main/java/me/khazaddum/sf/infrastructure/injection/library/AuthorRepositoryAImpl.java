package me.khazaddum.sf.infrastructure.injection.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepositoryAImpl implements IAuthorRepository {

	private static final Logger LOG = LoggerFactory.getLogger(AuthorRepositoryAImpl.class);

	public AuthorRepositoryAImpl() {
		super();
		LOG.info("Created");
	}

}
