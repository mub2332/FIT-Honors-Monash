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

    private boolean allocated = false;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "student_project", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Student> preferredByStudents = new HashSet<>();

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

    /**
     * Add student to Preference
     * If Project has already been allocated
     * Return False
     * @param student
     */
    public boolean addStudent(Student student) {
        if(allocated == false){
            this.preferredByStudents.add(student);
            student.getPreferences().add(this);
            return true;
        }
        else{
            return false;
        }

    }

    public void removeStudent(Student student) {
        this.preferredByStudents.remove(student);
        student.getPreferences().remove(this);
    }

    public void allocateStudent(){
        allocated = true;
    }
}
