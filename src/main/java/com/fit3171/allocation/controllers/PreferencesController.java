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

    @GetMapping("/")
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @GetMapping("/projects/{id}")
    public String getProjectById(@PathVariable Long id, Model model) {
        Optional<Project> project = projectService.findById(id);
        Iterable<Student> students = studentService.findAll();
        model.addAttribute("project", project.get());
        model.addAttribute("students", students);
        return "submitPreferences";
    }

    @PostMapping("/projects/{id}")
    public String savePreference(@PathVariable Long id, HttpServletRequest request) {
        Optional<Project> project = projectService.findById(id);
        Optional<Student> student = studentService.findByUsername(request.getParameter("username"));

        student.get().addPreference(project.get());
        studentService.save(student.get());
        return "redirect:/listPreferences";
    }

    @GetMapping("/listPreferences")
    public String getPreferences(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "listPreferences";
    }

}
