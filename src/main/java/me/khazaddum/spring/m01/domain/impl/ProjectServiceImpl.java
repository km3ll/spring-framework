package me.khazaddum.spring.m01.domain.impl;

import me.khazaddum.spring.m01.domain.IProjectRepository;
import me.khazaddum.spring.m01.domain.IProjectService;
import me.khazaddum.spring.m01.domain.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Service {
 */
@Service
public class ProjectServiceImpl implements IProjectService {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);

	private final IProjectRepository projectRepository;

	public ProjectServiceImpl(IProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
		LOG.info("Created");
	}

	@Override
	public Optional<Project> findById(Long id) {
		return projectRepository.findById(id);
	}

	@Override
	public Project save(Project project) {
		return projectRepository.save(project);
	}

}
