package com.fit3170.allocation.repositories;

import com.fit3170.allocation.models.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    public List<Project> findProjectsByDescriptionOrTitleContainingIgnoreCase(String s);
}
