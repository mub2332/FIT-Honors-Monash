package com.fit3171.allocation.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

/**
 * Models a 'Student' in the domain of operation
 */
@Getter
@Setter
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String username;

    @DBRef
    private ArrayList<Project> preferences = new ArrayList<>();

    @DBRef
    private Project allocatedProject = null;

    public void addPreference(Project project) {
        if (!this.preferences.contains(project)) {
            this.preferences.add(project);
            project.addPreference(this, this.preferences.size());
        }
    }

    public void removePreference(Project project) {
        this.preferences.remove(project);
        project.removePreference(this);
    }
}
