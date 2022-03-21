package me.khazaddum.spring.m02.domain;

import java.util.Optional;

public interface IProjectRepository {

	Optional<Project> findById(Long id);

	Project save(Project project);

}
