package com.fit3171.allocation.services;

import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * A service that implements the repository interface
 * and supplies Project data to the controllers
 */
@Service
public class ProjectService {
    private ProjectRepository projectRepository;

    @Autowired
    public void setProjectRepository(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Iterable<Project> findAll() {
        return projectRepository.findAll();
    }

    public Optional<Project> findById(String id) {
        return projectRepository.findById(id);
    }

    public Optional<Project> findByTitle(String title) {
        return projectRepository.findByTitle(title);
    }

    public void save(Project project) {
        projectRepository.save(project);
    }
}
