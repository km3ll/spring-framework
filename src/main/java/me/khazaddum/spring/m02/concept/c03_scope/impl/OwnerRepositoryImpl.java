package me.khazaddum.spring.m02.concept.c03_scope.impl;

import me.khazaddum.spring.m02.concept.c03_scope.IOwnerRepository;
import me.khazaddum.spring.m02.concept.c03_scope.IPetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OwnerRepositoryImpl implements IOwnerRepository {

	private static final Logger LOG = LoggerFactory.getLogger(OwnerRepositoryImpl.class);

	public OwnerRepositoryImpl() {
		LOG.info("Created");
	}

}
