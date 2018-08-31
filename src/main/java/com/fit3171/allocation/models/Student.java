package com.fit3171.allocation.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Entity(name = "Student")
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @ManyToMany(mappedBy = "preferredByStudents")
    private Set<Project> preferences = new HashSet<>();

    @OneToOne(mappedBy = "allocatedStudent")
    private Project allocatedProject = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Project> getPreferences() {
        return preferences;
    }

    public void addPreference(Project project) {
        this.preferences.add(project);
        project.getPreferredByStudents().add(this);
    }

    public void removePreference(Project project) {
        this.preferences.remove(project);
        project.getPreferredByStudents().remove(project);
    }

    public Project getAllocatedProject() {
        return allocatedProject;
    }

    public void setAllocatedProject(Project allocatedProject) {
        this.allocatedProject = allocatedProject;
    }
}