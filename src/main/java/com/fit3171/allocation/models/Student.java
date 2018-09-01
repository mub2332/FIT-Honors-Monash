package com.fit3171.allocation.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String username;

    @DBRef
    private Set<Project> preferences = new HashSet<>();
    @DBRef
    private Project allocatedProject = null;

    public void addPreference(Project project) {
        this.preferences.add(project);
        project.addPreference(this);
    }

    public void removePreference(Project project) {
        this.preferences.remove(project);
        project.removePreference(this);
    }
}
