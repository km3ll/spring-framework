package m01.service;

import m01.persistence.model.Project;
import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);

}
