package com.fit3171.allocation.controllers;

import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class PreferencesController {
    public ProjectService projectService;

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/")
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @GetMapping("/projects/{id}")
    public String getProjectById(@PathVariable Long id, Model model) {
        Optional<Project> project = projectService.findById(id);
        model.addAttribute("title", project.get().getTitle());
        model.addAttribute("description", project.get().getDescription());
        return "preferences";
    }
}
