package com.fit3170.allocation.services;

import com.fit3170.allocation.models.Project;
import com.fit3170.allocation.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Set<Project> getProjects() {

        Set<Project> projects = new HashSet<>();
        projectRepository.findAll().iterator().forEachRemaining(projects::add);
        return projects;

    }

    @Override
    public Project findById(Long id) {

        Optional<Project> projectOptional = projectRepository.findById(id);

        if (!projectOptional.isPresent()) {
            throw new RuntimeException("Project not found");
        }

        return projectOptional.get();
    }

    @Override
    public List<Project> findByText(String s) {

        List<Project> optionalProjects = projectRepository.findAllByDescriptionContains(s);

        return optionalProjects;
    }
}
