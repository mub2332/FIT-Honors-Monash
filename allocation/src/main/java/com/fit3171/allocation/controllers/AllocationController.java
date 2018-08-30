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
public class AllocationController {
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

    @GetMapping("/students/{username}")
    public String getProjectById(@PathVariable String username, Model model) {
        Optional<Student> student = studentService.findByUsername(username);
        model.addAttribute("student", student.get());
        return "allocateStudent";
    }

    @GetMapping("/allocateProject/{id}/{username}")
    public String setStudentAllocation(@PathVariable long id, @PathVariable String username ,Model model){
        Optional<Student> student = studentService.findByUsername(username);
        Optional<Project> project = projectService.findById(id);
        student.get().allocateProject(id);
        project.get().allocateStudent(student.get());
        studentService.save(student.get());
        Iterable<Student> allStudents = studentService.findAll();
        Iterable<Project> allProjects = projectService.findAll();
        model.addAttribute("studentService", studentService);
        model.addAttribute("projects", allProjects);
        return "projectsPage";
    }




}
