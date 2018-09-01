package com.fit3171.allocation.repositories;

import com.fit3171.allocation.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * A repository that defines query methods for the Student model
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {

    Optional<Student> findByUsername(String username);

    Iterable<Student> findAllByAllocatedProjectNotNull();

    Iterable<Student> findAllByAllocatedProjectNull();

    Optional<Student> findById(String ID);
}
