package erebor.spring.m01.app.controller;

import erebor.spring.m01.persistence.model.Project;
import erebor.spring.m01.service.IProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class ControllerM01 {

	private static final Logger LOG = LoggerFactory.getLogger(ControllerM01.class);

	private IProjectService projectService;

	public ControllerM01(@Autowired IProjectService projectService) {
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
		// functional style
		// return existingProject.map(ResponseEntity::ok).orElseGet(() ->
		// ResponseEntity.notFound().build());
	}

	@PostMapping("/project")
	public ResponseEntity<Project> saveProject(@RequestBody Project project) {
		Project createdProject = projectService.save(project);
		return ResponseEntity.ok(project);
	}

}