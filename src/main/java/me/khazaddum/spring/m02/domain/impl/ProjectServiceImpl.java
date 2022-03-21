package me.khazaddum.spring.m02.domain.impl;

import me.khazaddum.spring.m02.domain.IProjectRepository;
import me.khazaddum.spring.m02.domain.IProjectService;
import me.khazaddum.spring.m02.domain.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements IProjectService {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);

	private IProjectRepository projectRepository;

	public ProjectServiceImpl(IProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
		LOG.info("Created");
	}

	public Optional<Project> findById(Long id) {
		return projectRepository.findById(id);
	}

	public Project save(Project project) {
		return projectRepository.save(project);
	}

}
