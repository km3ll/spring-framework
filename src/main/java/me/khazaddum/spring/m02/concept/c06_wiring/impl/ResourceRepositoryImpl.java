package me.khazaddum.spring.m02.concept.c06_wiring.impl;

import me.khazaddum.spring.m02.concept.c06_wiring.IResourceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceRepositoryImpl implements IResourceRepository {

	private static final Logger LOG = LoggerFactory.getLogger(ResourceRepositoryImpl.class);

	public ResourceRepositoryImpl() {
		LOG.info("Created");
	}

}
