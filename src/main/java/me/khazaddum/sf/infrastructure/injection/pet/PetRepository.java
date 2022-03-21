package me.khazaddum.sf.infrastructure.injection.pet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetRepository {

	private static final Logger LOG = LoggerFactory.getLogger(PetRepository.class);

	public PetRepository() {
		LOG.info("Created");
	}

}
