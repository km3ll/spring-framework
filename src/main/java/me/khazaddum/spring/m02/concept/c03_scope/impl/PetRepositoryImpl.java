package me.khazaddum.spring.m02.concept.c03_scope.impl;

import me.khazaddum.spring.m02.concept.c03_scope.IPetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetRepositoryImpl implements IPetRepository {

	private static final Logger LOG = LoggerFactory.getLogger(PetRepositoryImpl.class);

	public PetRepositoryImpl() {
		LOG.info("Created");
	}

}
