package com.fit3171.allocation.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    //NEW
    private Integer rank=1;

    @DBRef
    private Set<Project> preferences = new HashSet<>();
    //NEW
    @DBRef
    Map<Integer,Project> testPref = new HashMap<Integer,Project>();

    @DBRef
    private Project allocatedProject = null;

    public void addPreference(Project project) {
        this.preferences.add(project);
        project.addPreference(this);
        //NEW
        this.testPref.put(this.getRank(), project);
        increaseRank();
    }

    public void removePreference(Project project) {
        this.preferences.remove(project);
        project.removePreference(this);
    }

    //NEW
    public void increaseRank() {
        if (this.rank < 5) {
            this.rank = this.rank + 1;
        }
    }
    public <Integer, Project> java.lang.Integer getRankingByProject(Project project) {
        for (Map.Entry<java.lang.Integer, com.fit3171.allocation.models.Project> entry : this.testPref.entrySet()) {
            if (project == entry.getValue()) {
                return entry.getKey();
            }
        }
        return null;
    }
}
