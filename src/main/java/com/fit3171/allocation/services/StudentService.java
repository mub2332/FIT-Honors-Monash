package com.fit3171.allocation.services;

import com.fit3171.allocation.models.Student;
import com.fit3171.allocation.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findByUsername(String username) {
        return studentRepository.findByUsername(username);
    }

    public Optional<Student> findById(String id){ return studentRepository.findById(id); }

    public Iterable<Student> findAllocatedStudents() {
        return studentRepository.findAllByAllocatedProjectNotNull();
    }

    public void save(Student student) {
        studentRepository.save(student);
    }
}
