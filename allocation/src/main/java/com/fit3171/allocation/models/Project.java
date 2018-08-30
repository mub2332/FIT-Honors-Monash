package com.fit3171.allocation.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "Project")
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "preferences", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Student> preferredByStudents = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "allocations", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Student allocatedStudent = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Student> getPreferredByStudents() {
        return preferredByStudents;
    }

    public void removeStudent(Student student) {
        this.preferredByStudents.remove(student);
        student.getPreferences().remove(this);
    }

    public Student getAllocatedStudent() {
        return allocatedStudent;
    }

    public void setAllocatedStudent(Student allocatedStudent) {
        this.allocatedStudent = allocatedStudent;
    }
}
