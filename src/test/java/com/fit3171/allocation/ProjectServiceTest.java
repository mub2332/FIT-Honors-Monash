package com.fit3171.allocation;

import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.repositories.ProjectRepository;
import com.fit3171.allocation.repositories.StudentRepository;
import com.fit3171.allocation.services.ProjectService;
import com.fit3171.allocation.services.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ProjectServiceTest {
    //private AllocationController allocationController;

    List<Project> projectTestList;
    @Mock
    ProjectRepository projectRepository;


    @InjectMocks
    private ProjectService projectService = new ProjectService();
    @Mock
    StudentRepository studentRepository;

    private StudentService studentService;


    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        studentService = new StudentService();
        projectService.setProjectRepository(projectRepository);
        studentService.setStudentRepository(studentRepository);
        projectTestList = new ArrayList<>();

        //add the projects in
        for (int i=0; i<5; i++){
            Project project = new Project();
            project.setId(String.valueOf(i));
            project.setTitle(String.valueOf(i));
            projectTestList.add(project);

        }

    }

    @Test
    public void findAllTest(){
        when(projectRepository.findAll()).thenReturn((List<Project>) projectTestList);
        List<Project> projectTestList = (List<Project>) projectService.findAll();
        assertEquals(projectTestList,projectTestList);
        assertEquals(projectTestList.get(0).getId(),"0");
        assertEquals(projectTestList.get(1).getId(),"1");
        assertEquals(projectTestList.get(2).getId(),"2");
        assertEquals(projectTestList.get(3).getId(),"3");
        assertEquals(projectTestList.get(4).getId(),"4");
    }

    @Test
    public void findByIdTest(){
        Project project = projectTestList.get(1);
        when(projectRepository.findById("1")).thenReturn(Optional.ofNullable(project));
        assertEquals(projectService.findById("1"),Optional.ofNullable(projectTestList.get(1)));
    }

    @Test
    public void findByUsernameTest(){
        Project project = projectTestList.get(1);
        when(projectRepository.findByTitle("1")).thenReturn(Optional.ofNullable(projectTestList.get(1)));
        assertEquals(projectService.findByTitle("1"),Optional.ofNullable(projectTestList.get(1)));
    }


}
