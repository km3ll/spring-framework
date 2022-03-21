package me.khazaddum.sf.infrastructure.injection.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositoryAImpl implements ICategoryRepository {

	private static final Logger LOG = LoggerFactory.getLogger(CategoryRepositoryAImpl.class);

	public CategoryRepositoryAImpl() {
		super();
		LOG.info("Created");
	}

}
