package com.fit3170.allocation.services;

import com.fit3170.allocation.AllocationApplication;
import com.fit3170.allocation.models.Project;
import com.fit3170.allocation.repositories.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ProjectServiceImplTest {
    ProjectServiceImpl projectService;
    Set <Project> projectTest;
    @Mock
    ProjectRepository projectRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        projectService = new ProjectServiceImpl(projectRepository);
        projectTest = new HashSet<>();
        //add the projects in
        projectTest.add(new Project("Artificial Intelligence", "Machine Learning as its best."));
        projectTest.add(new Project("Data Structures", "Efficiency in data."));
        projectTest.add(new Project("Ultrasonic Sensors", "Using Ultrasonic sensors to test distance"));
        projectTest.add(new Project("Heart Rate Monitor", "As the name implies"));
    }

    @Test
    public void getProjects() {
        when(projectService.getProjects()).thenReturn(projectTest);
        assertEquals(projectService.getProjects(),projectTest);
    }

    @Test
    public void findById() {
        Long id = Long.parseLong("123456");
        Long id2= Long.parseLong("56789");
        Project project1 = new Project("Dummy Project 1", "For Mock Testing");
        Project project2 = new Project("Dummy Project 1", "For Mock Testing");
        when(projectService.findById(id)).thenReturn(project1);
        when(projectService.findById(id2)).thenReturn(project2);
        assertEquals(projectService.findById(id),project1);
        assertEquals(projectService.findById(id2),project2);

    }

    @Test
    public void findByText() {
    }

}