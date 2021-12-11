package me.erebor.m01.persistence.repository;

import me.erebor.m01.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);

}
