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
    public String studentDetails(@PathVariable String username, Model model) {
        Optional<Student> student = studentService.findByUsername(username);
        model.addAttribute("student", student.get());
        return "allocateStudent";
    }

    @PostMapping("/students/{username}")
    public String allocateStudent(@PathVariable String username, HttpServletRequest request) {
        Optional<Student> student = studentService.findByUsername(username);
        Optional<Project> project = projectService.findByTitle(request.getParameter("allocate"));

        if (student.get().getAllocatedProject() == null && project.get().getAllocatedStudent() == null) {
            student.get().setAllocatedProject(project.get());
            project.get().setAllocatedStudent(student.get());
            studentService.save(student.get());
            projectService.save(project.get());
        }

        return "redirect:/listAllocations";
    }

    @GetMapping("/listAllocations")
    public String getAllocations(Model model) {
        model.addAttribute("students", studentService.findAllocatedStudents());
        return "listAllocations";
    }

}
