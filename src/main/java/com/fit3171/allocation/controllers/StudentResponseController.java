package com.fit3171.allocation.controllers;

import com.fit3171.allocation.models.Student;
import com.fit3171.allocation.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentResponseController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/showByUsername/{username}")
    public Optional<Student> getStudentByUsername(@PathVariable String username) {
        return studentRepository.findByUsername(username);
    }

    @GetMapping("/showById/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return studentRepository.findById(id);
    }

    @GetMapping("/showAllocated")
    public Iterable<Student> getAllocatedStudents() {
        return studentRepository.findAllByAllocatedProjectNotNull();
    }

    @GetMapping("/showUnallocated")
    public Iterable<Student> getUnallocatedStudents() {
        return studentRepository.findAllByAllocatedProjectNull();
    }
}
