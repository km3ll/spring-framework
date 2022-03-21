package me.khazaddum.sf.infrastructure.injection.pet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OwnerRepository {

	private static final Logger LOG = LoggerFactory.getLogger(PetService.class);

	public OwnerRepository() {
		LOG.info("Created");
	}

}
