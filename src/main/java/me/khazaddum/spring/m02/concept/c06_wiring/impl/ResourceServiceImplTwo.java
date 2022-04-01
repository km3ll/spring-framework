package me.khazaddum.spring.m02.concept.c06_wiring.impl;

import me.khazaddum.spring.m02.concept.c06_wiring.IResourceRepository;
import me.khazaddum.spring.m02.concept.c06_wiring.IResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import javax.inject.Named;

@Service
public class ResourceServiceImplTwo implements IResourceService {

	private static final Logger LOG = LoggerFactory.getLogger(ResourceServiceImplTwo.class);

	private IResourceRepository resourceRepository;

	@Inject
	@Named("resourceRepositoryImpl")
	public ResourceServiceImplTwo(IResourceRepository iResourceRepository) {
		this.resourceRepository = iResourceRepository;
		LOG.info("Created");
		LOG.info("Injected resourceRepository instance {}", iResourceRepository);
	}

}
