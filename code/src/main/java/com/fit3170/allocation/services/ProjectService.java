package com.fit3170.allocation.services;

import com.fit3170.allocation.models.Project;

import java.util.Set;

public interface ProjectService {

    Set<Project> getProjects();

    Project findById(Long id);
}
