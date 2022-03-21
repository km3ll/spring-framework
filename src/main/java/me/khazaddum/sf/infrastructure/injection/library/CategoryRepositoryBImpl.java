package me.khazaddum.sf.infrastructure.injection.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class CategoryRepositoryBImpl implements ICategoryRepository {

	private static final Logger LOG = LoggerFactory.getLogger(CategoryRepositoryBImpl.class);

	public CategoryRepositoryBImpl() {
		super();
		LOG.info("Created");
	}

}
