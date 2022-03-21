package me.khazaddum.spring.m02.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepository {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectRepository.class);

	private List<Project> projects = new ArrayList<Project>();

	public ProjectRepository() {
		LOG.info("Created");
	}

	public Optional<Project> findById(Long id) {
		return projects.stream().filter(p -> p.getId().equals(id)).findFirst();
	}

	public Project save(Project project) {
		Project existingProject = findById(project.getId()).orElse(null);
		if (null == existingProject) {
			projects.add(project);
		}
		else {
			projects.remove(project);
			Project newProject = new Project(project);
			projects.add(newProject);
		}
		return project;
	}

}