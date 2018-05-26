package com.fit3170.allocation.repositories;

import com.fit3170.allocation.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
