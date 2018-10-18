package com.fit3171.allocation.controllers;

import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
public class ProjectResponseController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public Iterable<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
