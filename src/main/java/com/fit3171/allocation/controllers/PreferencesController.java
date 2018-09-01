package com.fit3171.allocation.controllers;

import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.models.Student;
import com.fit3171.allocation.services.ProjectService;
import com.fit3171.allocation.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * This class controls the flow of data between the models and views
 * responsible for performing the 'Submit Preferences' use case
 */
@Controller
public class PreferencesController {
    public ProjectService projectService;
    public StudentService studentService;

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    // Get a list of all available projects
    @GetMapping("/")
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    // Get a particular project that the user will select from the
    // front-end, and take them to page where they can choose to
    // submit a preference for that project
    @GetMapping("/projects/{id}")
    public String getProjectById(@PathVariable String id, Model model) {
        Optional<Project> project = projectService.findById(id);
        Iterable<Student> students = studentService.findAll();
        model.addAttribute("project", project.get());
        model.addAttribute("students", students);
        return "submitPreferences";
    }

    // Save the submitted preference to the database, and redirect the user
    // to a page where they can see the list of preferences that have already
    // been submitted
    @PostMapping("/projects/{id}")
    public String savePreference(@PathVariable String id, HttpServletRequest request) {
        Optional<Project> project = projectService.findById(id);
        Optional<Student> student = studentService.findByUsername(request.getParameter("username"));

        student.get().addPreference(project.get());
        studentService.save(student.get());
        return "redirect:/listPreferences";
    }

    // Get list of submitted preferences
    @GetMapping("/listPreferences")
    public String getPreferences(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "listPreferences";
    }

}
