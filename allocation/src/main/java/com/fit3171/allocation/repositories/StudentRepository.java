package com.fit3171.allocation.repositories;

import com.fit3171.allocation.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
