package com.fit3171.allocation.repositories;

import com.fit3171.allocation.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * A repository that defines query methods for the Project model
 */
@Repository
public interface ProjectRepository extends MongoRepository<Project, Long> {

    Optional<Project> findByTitle(String title);
    Optional<Project> findById(String id);
}
