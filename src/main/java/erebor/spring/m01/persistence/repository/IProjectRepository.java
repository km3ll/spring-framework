package erebor.spring.m01.persistence.repository;

import erebor.spring.m01.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {

	Optional<Project> findById(Long id);

	Project save(Project project);

}