package com.fit3170.allocation.controllers;

import com.fit3170.allocation.repositories.ProjectSearch;
import com.fit3170.allocation.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    private ProjectSearch projectSearch;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping("/project/show/{id}")
    public String showById(@PathVariable String id, Model model) {

        model.addAttribute("project", projectService.findById(new Long(id)));

        return "project/show";
    }

    @RequestMapping(value = "/project/search")
    public String showByText(String search, Model model) {

        List searchResults = null;

        try {
            searchResults = projectSearch.search(search);
        }
        catch (Exception ex) {
            // here you should handle unexpected errors
            // ...
            // throw ex;
        }
        model.addAttribute("searchResults", searchResults);
        return "project/search";
    }
}
