package com.fit3170.allocation.controllers;

import com.fit3170.allocation.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping("/project/show/{id}")
    public String showById(@PathVariable String id, Model model) {

        model.addAttribute("project", projectService.findById(new Long(id)));

        return "project/show";
    }
}
