//package com.fit3171.allocation;
//
//
//import com.fit3171.allocation.models.Project;
//import com.fit3171.allocation.models.Student;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//
//public class ProjectStudentTest {
//
//    @Test
//    public void projectBasicGet() {
//        Project project = mock(Project.class);
//
//        when(project.getId()).thenReturn("1234");
//        assertEquals(project.getId(), "1234");
//
//        when(project.getAimsAndOutline()).thenReturn("Aim");
//        assertEquals(project.getAimsAndOutline(), "Aim");
//
//        when(project.getDescription()).thenReturn("Description");
//        assertEquals(project.getDescription(), "Description");
//
//        when(project.getPreAndCorequisiteKnowledge()).thenReturn("PreCo");
//        assertEquals(project.getPreAndCorequisiteKnowledge(), "PreCo");
//
//        when(project.getTitle()).thenReturn("Title");
//        assertEquals(project.getTitle(), "Title");
//
//
//        Student student = new Student();
//        student.setId("HELLOWORLD");
//        when(project.getAllocatedStudent()).thenReturn(student);
//        assertEquals(project.getAllocatedStudent(), student);
//
//        Set<Student> setStudent = new HashSet<>();
//        setStudent.add(student);
//        when(project.getPreferredByStudents()).thenReturn(setStudent);
//        assertEquals(project.getPreferredByStudents(), setStudent);
//
//        ArrayList<Integer> arrayListInt = new ArrayList<>();
//        arrayListInt.add(123);
//        when(project.getCreditPoints()).thenReturn(arrayListInt);
//        assertEquals(project.getCreditPoints(), arrayListInt);
//
//        ArrayList<String> arrayListString = new ArrayList<>();
//        arrayListString.add("HELLOWORLD");
//        when(project.getFieldsOfStudy()).thenReturn(arrayListString);
//        assertEquals(project.getFieldsOfStudy(), arrayListString);
//
//        when(project.getSupervisors()).thenReturn(arrayListString);
//        assertEquals(project.getSupervisors(), arrayListString);
//
//        when(project.getUrlsAndReferences()).thenReturn(arrayListString);
//        assertEquals(project.getUrlsAndReferences(), arrayListString);
//
//    }
//
//    @Test
//    public void studentBasicGet(){
//        Student student = mock(Student.class);
//
//        when(student.getId()).thenReturn("StudentID");
//        assertEquals(student.getId(), "StudentID");
//
//        when(student.getUsername()).thenReturn("Username");
//        assertEquals(student.getUsername(), "Username");
//
//
//        Project project = new Project();
//        project.setId("ID");
//        when(student.getAllocatedProject()).thenReturn(project);
//        assertEquals(student.getAllocatedProject(), project);
//
//        Set<Project> setProject = new HashSet<>();
//        setProject.add(project);
//        when(student.getPreferences()).thenReturn(setProject);
//        assertEquals(student.getPreferences(), setProject);
//
//    }
//
//}
