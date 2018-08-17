package com.fit3170.allocation.models;

import org.jboss.logging.Field;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;

@Entity
@Indexed
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
