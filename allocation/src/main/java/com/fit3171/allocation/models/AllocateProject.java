package com.fit3171.allocation.models;

import com.fit3171.allocation.repositories.StudentRepository;
import com.fit3171.allocation.services.ProjectService;
import com.fit3171.allocation.services.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class AllocateProject {




    /*@RequestMapping(value = "/allocate", method = RequestMethod.POST)
    public String allocateProject(@RequestParam("studentID") Long studentID, @RequestParam("ProjectID") Long ID) {
        StudentService studentservice = new StudentService();
        Student student = studentservice.findByID(studentID).get();

        ProjectService projectService = new ProjectService();
        Project project = projectService.findById(ID).get();
        return null;

    }
    */
}
