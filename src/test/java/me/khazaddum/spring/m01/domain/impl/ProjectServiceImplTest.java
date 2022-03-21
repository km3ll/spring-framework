package me.khazaddum.spring.m01.domain.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import me.khazaddum.spring.m01.domain.IProjectRepository;
import me.khazaddum.spring.m01.domain.IProjectService;
import me.khazaddum.spring.m01.domain.Project;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

@Tag("unit")
class ProjectServiceImplTest {

	@Test
	public void givenNewProject_thenSaveIsSuccessful() {

		IProjectRepository repository = new ProjectRepositoryImpl();
		IProjectService service = new ProjectServiceImpl(repository);
		Project project = new Project(1100L, "Test drive", LocalDate.now());

		assertNotNull(service.save(project));

	}

	@Test
	public void givenInvalidId_thenFindByIdReturnsEmpty() {

		IProjectRepository repository = new ProjectRepositoryImpl();
		IProjectService service = new ProjectServiceImpl(repository);

		assertFalse(service.findById(1100L).isPresent());

	}

	@Test
	public void givenValidId_thenFindByIdReturnsNonEmpty() {

		IProjectRepository repository = new ProjectRepositoryImpl();
		IProjectService service = new ProjectServiceImpl(repository);
		Project project = new Project(1100L, "Test drive", LocalDate.now());
		service.save(project);

		assertTrue(service.findById(1100L).isPresent());

	}

}