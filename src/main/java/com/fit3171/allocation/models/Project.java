package com.fit3171.allocation.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document(collection = "projects")
public class Project {
    @Id
    private String id;
    private String title;
    private String description;
    private String aimsAndOutline;
    private String preAndCorequisiteKnowledge;
    private ArrayList<Integer> creditPoints;
    private ArrayList<String> supervisors;
    private ArrayList<String> urlsAndReferences;
    private ArrayList<String> fieldsOfStudy;

    @DBRef
    private Set<Student> preferredByStudents = new HashSet<>();
    @DBRef
    private Student allocatedStudent = null;

    public void removePreference(Student student) {
        this.preferredByStudents.remove(student);
    }

    public void addPreference(Student student) {
        this.preferredByStudents.add(student);
    }
}
