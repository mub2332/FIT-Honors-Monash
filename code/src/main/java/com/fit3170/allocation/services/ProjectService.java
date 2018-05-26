package com.fit3170.allocation.services;

import com.fit3170.allocation.models.Project;

import java.util.List;
import java.util.Set;

public interface ProjectService {

    Set<Project> getProjects();

    Project findById(Long id);

    List<Project> findByText(String s);
}
