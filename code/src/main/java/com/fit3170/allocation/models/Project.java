package com.fit3170.allocation.models;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

@Entity
@Indexed
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Field
    private String title;
    @Field
    private String description;

    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
