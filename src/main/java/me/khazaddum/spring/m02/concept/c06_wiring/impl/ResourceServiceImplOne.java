package me.khazaddum.spring.m02.concept.c06_wiring.impl;

import me.khazaddum.spring.m02.concept.c06_wiring.IResourceRepository;
import me.khazaddum.spring.m02.concept.c06_wiring.IResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ResourceServiceImplOne implements IResourceService {

	private static final Logger LOG = LoggerFactory.getLogger(ResourceServiceImplOne.class);

	private IResourceRepository resourceRepository;

	public ResourceServiceImplOne() {
		LOG.info("Created");
	}

	@Resource
	// @Resource(name = "resourceRepositoryImpl")
	public void setResourceRepository(IResourceRepository iResourceRepository) {
		this.resourceRepository = iResourceRepository;
		LOG.info("Wired resourceRepository instance {}", iResourceRepository);
	}

}
