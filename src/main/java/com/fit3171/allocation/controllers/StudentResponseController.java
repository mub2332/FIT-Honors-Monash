package com.fit3171.allocation.controllers;

import com.fit3171.allocation.models.Student;
import com.fit3171.allocation.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/*
Rest controller for Student entity
 */
@RestController
@RequestMapping("/api/students")
public class StudentResponseController {

    @Autowired
    private StudentRepository studentRepository;

    // Return all students in database
    @GetMapping
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Return student with the given username
    @GetMapping("/showByUsername/{username}")
    public Optional<Student> getStudentByUsername(@PathVariable String username) {
        return studentRepository.findByUsername(username);
    }

    // Return student with the given id
    @GetMapping("/showById/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return studentRepository.findById(id);
    }

    // Return all students that have been allocated to a project
    @GetMapping("/showAllocated")
    public Iterable<Student> getAllocatedStudents() {
        return studentRepository.findAllByAllocatedProjectNotNull();
    }

    // Return all unallocated students
    @GetMapping("/showUnallocated")
    public Iterable<Student> getUnallocatedStudents() {
        return studentRepository.findAllByAllocatedProjectNull();
    }
}
