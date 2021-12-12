package erebor.spring.m01.service;

import erebor.spring.m01.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);

}
