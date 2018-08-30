package com.fit3171.allocation.repositories;

import com.fit3171.allocation.models.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Long> {

    Optional<Student> findByUsername(String username);

    Optional<Student> findByID(Long ID);
}
