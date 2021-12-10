package me.erebor.m01.app.controller;

import me.erebor.m01.persistence.model.Project;
import me.erebor.m01.service.IProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ControllerM01 {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerM01.class);

    private IProjectService projectService;

    public ControllerM01(@Autowired IProjectService projectService) {
        this.projectService = projectService;
        LOG.info("Created");
    }

    @GetMapping("/project")
    ResponseEntity<String> getProject(@RequestParam Long id) {
        Optional<Project> existingProject = projectService.findById(id);
        if (existingProject.isPresent()) {
            return new ResponseEntity<>(existingProject.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(String.format("Project with id %s not found", id), HttpStatus.NOT_FOUND);
        }
    }

    //TODO. Add POST endpoint

}