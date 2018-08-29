package com.fit3171.allocation.repositories;

import com.fit3171.allocation.models.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
