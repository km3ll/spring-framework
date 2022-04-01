package me.khazaddum.spring.m02.domain;

import java.util.Optional;

public interface IProjectService {

	Optional<Project> findById(Long id);

	Project save(Project project);

}
