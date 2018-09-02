package com.fit3171.allocation.config;

import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.models.Student;
import com.fit3171.allocation.repositories.ProjectRepository;
import com.fit3171.allocation.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class loads seed data into the database when the Spring
 * application loads up.
 **/

@Slf4j
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final ProjectRepository projectRepository;
    private final StudentRepository studentRepository;



    public DataLoader(ProjectRepository projectRepository, StudentRepository studentRepository) {
        this.projectRepository = projectRepository;
        this.studentRepository = studentRepository;
    }

    // Load data when the Spring app boots up
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadProjects();
        loadStudents();
        log.debug("Loading data");
    }

    // Load list of students
    private void loadStudents() {
        Student student = new Student();
        student.setId("27738965");
        student.setUsername("mmah65");
        studentRepository.save(student);

        Student student2 = new Student();
        student2.setId("28538867");
        student2.setUsername("jlim29");
        studentRepository.save(student2);

        Student student3 = new Student();
        student3.setId("23456789");
        student3.setUsername("nbin45");
        studentRepository.save(student3);

        Student student4 = new Student();
        student4.setId("25673421");
        student4.setUsername("ikfel31");
        studentRepository.save(student4);

        Student student5 = new Student();
        student5.setId("23324567");
        student5.setUsername("ljei67");
        studentRepository.save(student5);

        Student student6 = new Student();
        student6.setId("24356456");
        student6.setUsername("azik89");
        studentRepository.save(student6);
    }

    // Load list of projects using data from FIT Honors project site
    private void loadProjects() {
        Project project00001 = new Project();
        project.setId("P00001");
        project.setTitle("Digital repositories for Art Archives");
        project.setDescription("How can a living archive be created that not only documents the Monash University Prato Centre (MUPC) Visual Residency Program but also engages artists-in-residence in a direct and active way as part of their residency experience in Prato? In collaboration with Monash University Museum of Art and Monash University Prato Centre, this project aims to help realise the creative possibilities inherent in cross-fertilizing artistic processes with archival theory. It will establish a prototype archival platform that complements contemporary art practices and supports the ability to record, relate and re-vision ephemera and events associated with transformative, creative experience as artefacts themselves.");
        project.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
        project.setAimsAndOutline("To develop a prototype digital repository suitable for use by artists participating in the Monash University Prato Artists in Residence Program.");
        project.setPreAndCorequisiteKnowledge("Familiarity with digital repositories and/or open source software and/or archival principles.");
        project.setSupervisors(new ArrayList<String>(Arrays.asList("Tom Denison", "Gillian Oliver")));
        project.setUrlsAndReferences(null);
        project.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
        projectRepository.save(project00001);

        Project project00058 = new Project();
        project.setId("P00058");
        project.setTitle("Online Handwritten Signature Verification");
        project.setDescription("This project is in an area of my earlier research. A number of research papers were published.")
        project.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
        project.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.")
        project.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming")
        project.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
        project.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
        project.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
        projectRepository.save(project00058);
    }
}
