package me.khazaddum.spring.m01.app;

import me.khazaddum.spring.m01.domain.IProjectService;
import me.khazaddum.spring.m01.domain.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class Controller {

	private static final Logger LOG = LoggerFactory.getLogger(Controller.class);

	private IProjectService projectService;

	public Controller(IProjectService projectService) {
		this.projectService = projectService;
		LOG.info("Created");
	}

	@GetMapping("/project")
	public ResponseEntity<Project> getProject(@RequestParam Long id) {
		Optional<Project> existingProject = projectService.findById(id);
		if (existingProject.isPresent()) {
			return ResponseEntity.ok(existingProject.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
		/*
		 * Functional style return existingProject .map(ResponseEntity::ok) .orElseGet(()
		 * -> ResponseEntity.notFound().build());
		 */
	}

	@PostMapping("/project")
	public ResponseEntity<Project> saveProject(@RequestBody Project project) {
		Project createdProject = projectService.save(project);
		return ResponseEntity.ok(project);
	}

}
