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
    private ProjectService projectService = new ProjectService();
    @Mock
    StudentRepository studentRepository;

    private StudentService studentService;
    private List<Student> studentTestList;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        studentService = new StudentService();
        preferencesController = new PreferencesController();
        projectService.setProjectRepository(projectRepository);
        studentService.setStudentRepository(studentRepository);
        projectTestList = new ArrayList<>();
        studentTestList = new ArrayList<>();
        //add the projects in
        for (int i=0; i<5; i++){
            Project project = new Project();
            Student student = new Student();
            project.setId(String.valueOf(i));
            student.setId(String.valueOf(i));
            project.setId(String.valueOf(i));
            student.setUsername(String.valueOf(i));
            projectTestList.add(project);
            studentTestList.add(student);
        }

    }

    @Test
    public void findAllTest(){
        when(studentRepository.findAll()).thenReturn((List<Student>) studentTestList);
        List<Student> studentList = (List<Student>) studentService.findAll();
        assertEquals(studentList,studentTestList);
        assertEquals(studentList.get(0).getId(),"0");
        assertEquals(studentList.get(1).getId(),"1");
        assertEquals(studentList.get(2).getId(),"2");
        assertEquals(studentList.get(3).getId(),"3");
        assertEquals(studentList.get(4).getId(),"4");
    }

    @Test
    public void findByIdTest(){
        Student student = studentTestList.get(1);
        when(studentRepository.findById("1")).thenReturn(java.util.Optional.ofNullable(studentTestList.get(1)));
        assertEquals(studentService.findById("1"),java.util.Optional.ofNullable(studentTestList.get(1)));
    }

    @Test
    public void findByUsernameTest(){
        Student student = studentTestList.get(1);
        when(studentRepository.findByUsername("1")).thenReturn(java.util.Optional.ofNullable(studentTestList.get(1)));
        assertEquals(studentService.findByUsername("1"),java.util.Optional.ofNullable(studentTestList.get(1)));
    }

    @Test
    public void findAllocationsTest(){
        when(studentRepository.findAllByAllocatedProjectNotNull()).thenReturn(studentTestList);
        assertEquals(studentService.findAllocatedStudents(),studentTestList);
    }
}
