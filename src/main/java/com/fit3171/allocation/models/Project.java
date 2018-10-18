package com.fit3171.allocation.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

/**
 * Models a 'Project' in the domain of operation
 */
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

    private ArrayList<Integer> creditPoints = new ArrayList<>();
    private ArrayList<String> urlsAndReferences = new ArrayList<>();
    private ArrayList<String> fieldsOfStudy = new ArrayList<>();

    @DBRef
    private ArrayList<Supervisor> supervisors = new ArrayList<>();

    @DBRef
    private ArrayList<Student> preferredByStudents = new ArrayList<>();

    @DBRef
    private Student allocatedStudent = null;

}
