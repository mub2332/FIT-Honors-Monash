package com.fit3171.allocation;

import com.fit3171.allocation.controllers.PreferencesController;
import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.models.Student;
import com.fit3171.allocation.repositories.ProjectRepository;
import com.fit3171.allocation.repositories.StudentRepository;
import com.fit3171.allocation.services.ProjectService;
import com.fit3171.allocation.services.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {


    //private AllocationController allocationController;
    private PreferencesController preferencesController;
    List<Project> projectTestList;
    @Mock
    ProjectRepository projectRepository;
    @InjectMocks
    private ProjectService projectService;

    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    private StudentService studentService;
    private List<Student> studentTestList;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        projectService = new ProjectService();
        studentService = new StudentService();
        preferencesController = new PreferencesController();
        projectTestList = new ArrayList<>();
        studentTestList = new ArrayList<>();
        //add the projects in


    }

    @Test
    public void addPreferenceTest(){
        when(projectRepository.findAll()).thenReturn((List<Project>) projectTestList);
        when(studentRepository.findAll()).thenReturn((List<Student>) studentTestList);
        assertEquals(projectService.findAll(),studentTestList);
    }

}
