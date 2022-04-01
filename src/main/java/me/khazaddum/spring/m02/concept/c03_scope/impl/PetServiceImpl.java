package me.khazaddum.spring.m02.concept.c03_scope.impl;

import me.khazaddum.spring.m02.concept.c03_scope.IOwnerRepository;
import me.khazaddum.spring.m02.concept.c03_scope.IPetRepository;
import me.khazaddum.spring.m02.concept.c03_scope.IPetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class PetServiceImpl implements IPetService {

	private static final Logger LOG = LoggerFactory.getLogger(PetServiceImpl.class);

	private IPetRepository petRepositoryOne;

	private IPetRepository petRepositoryTwo;

	private IOwnerRepository ownerRepositoryOne;

	private IOwnerRepository ownerRepositoryTwo;

	public PetServiceImpl(IPetRepository petRepositoryOne, IPetRepository petRepositoryTwo,
			IOwnerRepository ownerRepositoryOne, IOwnerRepository ownerRepositoryTwo) {
		this.petRepositoryOne = petRepositoryOne;
		this.petRepositoryTwo = petRepositoryTwo;
		this.ownerRepositoryOne = ownerRepositoryOne;
		this.ownerRepositoryTwo = ownerRepositoryTwo;
		LOG.info("Created");
	}

	@PostConstruct
	public void postConstruct() {

		LOG.info(String.format("Singleton repositories: one=%s and two=%s", petRepositoryOne, petRepositoryTwo));

		LOG.info(String.format("Prototype repositories: one=%s and two=%s", ownerRepositoryOne, ownerRepositoryTwo));

	}

}
