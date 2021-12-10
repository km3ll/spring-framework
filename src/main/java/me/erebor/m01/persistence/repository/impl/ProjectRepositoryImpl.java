package me.erebor.m01.persistence.repository.impl;

import me.erebor.m01.persistence.model.Project;
import me.erebor.m01.persistence.repository.IProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    private static final Logger LOG = LoggerFactory.getLogger(ProjectRepositoryImpl.class);

    private List<Project> projects = new ArrayList<Project>();

    public ProjectRepositoryImpl() {
        LOG.info("Created");
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst();
    }

    @Override
    public Project save(Project project) {
        Project existingProject = findById(project.getId()).orElse(null);
        if (null == existingProject) {
            projects.add(project);
        } else {
            projects.remove(project);
            Project newProject = new Project(project);
            projects.add(newProject);
        }
        return project;
    }

}