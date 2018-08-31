package com.fit3171.allocation.repositories;

import com.fit3171.allocation.models.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    Optional<Project> findByTitle(String title);
}
