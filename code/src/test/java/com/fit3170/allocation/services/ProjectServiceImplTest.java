package com.fit3170.allocation.services;

import com.fit3170.allocation.AllocationApplication;
import com.fit3170.allocation.models.Project;
import com.fit3170.allocation.repositories.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/*
Update 27/5/2018 10:56PM:
As the search functionality is not entirely complete yet, mock data is mostly used at the moment
 */
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
    public void getProjectsWithMock() {
        when(projectService.getProjects()).thenReturn(projectTest);
        assertEquals(projectService.getProjects(),projectTest);

    }

    @Test (expected = RuntimeException.class)
    public void findByIdWithEmpty() {
        //since there are no projects at the moment, it will raise an exception
        String randomId = "23123213";
        projectService.findById(Long.parseLong((randomId)));

    }

    @Test
    public void findByTextWithMock() {
        Project project1 = new Project("Dummy Project 1", "For Mock Testing");
        Project project2 = new Project("Dummy Project 2", "For Mock Testing");
        Project project3 = new Project("Test Project 1", "For Mock Testing");
        Project project4 = new Project("Test Project 2", "For Mock Testing");
        List<Project> list1 = new ArrayList<Project>();
        list1.add(project1);
        list1.add(project2);
        List<Project> list2 = new ArrayList<Project>();
        list1.add(project3);
        list1.add(project4);
        when(projectService.findByText("Dummy Project")).thenReturn(list1);
        when(projectService.findByText("Test Project")).thenReturn(list2);
        assertEquals(projectService.findByText("Dummy Project"),list1);
        assertEquals(projectService.findByText("Test Project"),list2);
    }

}