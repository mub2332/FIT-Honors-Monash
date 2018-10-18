package com.fit3171.allocation.config;

import com.fit3171.allocation.models.Project;
import com.fit3171.allocation.models.Student;
import com.fit3171.allocation.models.Supervisor;
import com.fit3171.allocation.repositories.ProjectRepository;
import com.fit3171.allocation.repositories.StudentRepository;
import com.fit3171.allocation.repositories.SupervisorRepository;
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
    private final SupervisorRepository supervisorRepository;

    public DataLoader(ProjectRepository projectRepository, StudentRepository studentRepository, SupervisorRepository supervisorRepository) {
        this.projectRepository = projectRepository;
        this.studentRepository = studentRepository;
        this.supervisorRepository = supervisorRepository;
    }

    // Load data when the Spring app boots up
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        this.projectRepository.deleteAll();
        this.studentRepository.deleteAll();
        this.studentRepository.deleteAll();
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
        // Project 1 + supervisors
        Supervisor tomDenison = new Supervisor();
        tomDenison.setId("1");
        tomDenison.setName("Tom Denison");

        Supervisor gillianOliver = new Supervisor();
        gillianOliver.setId("2");
        gillianOliver.setName("Gillian Oliver");

        Project artArchives = new Project();
        artArchives.setId("1");
        artArchives.setTitle("Digital repositories for Art Archives");
        artArchives.setDescription("How can a living archive be created that not only documents the Monash University Prato Centre (MUPC) Visual Residency Program but also engages artists-in-residence in a direct and active way as part of their residency experience in Prato? In collaboration with Monash University Museum of Art and Monash University Prato Centre, this project aims to help realise the creative possibilities inherent in cross-fertilizing artistic processes with archival theory. It will establish a prototype archival platform that complements contemporary art practices and supports the ability to record, relate and re-vision ephemera and events associated with transformative, creative experience as artefacts themselves.");
        artArchives.setSupervisors(new ArrayList<Supervisor>() {{
            add(tomDenison);
            add(gillianOliver);
        }});
        artArchives.setAimsAndOutline("To develop a prototype digital repository suitable for use by artists participating in the Monash University Prato Artists in Residence Program.");
        artArchives.setPreAndCorequisiteKnowledge("Familiarity with digital repositories and/or open source software and/or archival principles.\n" +
                "\n");
        artArchives.setCreditPoints(new ArrayList<Integer>() {{
            add(18);
            add(24);
        }});
        artArchives.setFieldsOfStudy(new ArrayList<String>() {{
            add("Art");
        }});
        artArchives.setUrlsAndReferences(null);

        supervisorRepository.save(tomDenison);
        supervisorRepository.save(gillianOliver);
        projectRepository.save(artArchives);

        // Project 2 + supervisors
        Supervisor pierreLeBodic = new Supervisor();
        pierreLeBodic.setId("3");
        pierreLeBodic.setName("Pierre Le Bodic");

        Project approxBranchBoundAlgo = new Project();
        approxBranchBoundAlgo.setId("2");
        approxBranchBoundAlgo.setTitle("Approximation algorithms in the Branch-and-Bound algorithm");
        approxBranchBoundAlgo.setDescription("The Branch-and-Bound algorithm solves optimisation problems by recursively dividing and exploring the space of solutions, using bounds computed on each of them to prune entire subspaces of solutions. The bounds are often computed using a linear program, and the efficiency of the whole procedure depends on the quality of these bounds and the efficiency with which they can be computed.");
        approxBranchBoundAlgo.setCreditPoints(new ArrayList<Integer>() {{
            add(18);
            add(24);
        }});
        approxBranchBoundAlgo.setSupervisors(new ArrayList<Supervisor>() {{
            add(pierreLeBodic);
        }});
        approxBranchBoundAlgo.setAimsAndOutline("In this project you will analyse theoretically and experimentally the benefits of using approximation algorithms (i.e. heuristics with a performance guarantee) to compute the bound, compared to a bound computed using linear programming.");
        approxBranchBoundAlgo.setUrlsAndReferences(new ArrayList<String>() {{
            add("https://en.wikipedia.org/wiki/Branch_and_bound");
            add("https://en.wikipedia.org/wiki/Approximation_algorithm");
            add("http://dx.doi.org/10.1007/978-3-319-11008-0");
            add("https://www.cc.gatech.edu/fac/Vijay.Vazirani/book.pdf");
            add("http://www.designofapproxalgs.com/book.pdf");
        }});
        approxBranchBoundAlgo.setPreAndCorequisiteKnowledge("A strong background in computational complexity is necessary. Knowledge of integer programming is a plus.");
        approxBranchBoundAlgo.setFieldsOfStudy(new ArrayList<String>() {{
            add("Algorithms");
        }});

        supervisorRepository.save(pierreLeBodic);
        projectRepository.save(approxBranchBoundAlgo);

        // Project 3 + supervisors
        Supervisor danielHarabor = new Supervisor();
        danielHarabor.setId("4");
        danielHarabor.setName("Daniel Harabor");

        Project autoWarehouseOpt = new Project();
        autoWarehouseOpt.setId("3");
        autoWarehouseOpt.setTitle("Automated Warehouse Optimisation");
        autoWarehouseOpt.setDescription("Warehouses are becoming increasingly automated and optimised. A great example is Amazon fulfilment centres (see https://www.youtube.com/watch?v=tMpsMt7ETi8 ). Many computer science problems, ranging from pathfinding to scheduling and facility layout, need to be solved to design efficient warehouses and their systems. These individual problems are not all well formalised and solved yet, and contributions in these directions are bound to have a high scientific and societal impact.");
        autoWarehouseOpt.setCreditPoints(new ArrayList<Integer>() {{
            add(18);
            add(24);
        }});
        autoWarehouseOpt.setSupervisors(new ArrayList<Supervisor>() {{
            add(pierreLeBodic);
            add(danielHarabor);
        }});
        autoWarehouseOpt.setAimsAndOutline("The aim of this project is to formalise one of the problems related to warehouse automation, design methods to solve the problem, and run experiments to assess their performance.");
        autoWarehouseOpt.setUrlsAndReferences(new ArrayList<String>() {{
            add("https://www.youtube.com/watch?v=YSrnV0wZywU");
            add("https://www.youtube.com/watch?v=lT4X3cuIHK8");
        }});
        autoWarehouseOpt.setPreAndCorequisiteKnowledge("Strong general background in CS, both in theory and practice, and interest in pathfinding and/or optimisation");
        autoWarehouseOpt.setFieldsOfStudy(new ArrayList<String>() {{
            add("Optimisation");
        }});

        supervisorRepository.save(danielHarabor);
        projectRepository.save(autoWarehouseOpt);

        // Project 4 + supervisors

    }
}

