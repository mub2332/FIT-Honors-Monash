//package com.fit3171.allocation.config;
//
//import com.fit3171.allocation.models.Project;
//import com.fit3171.allocation.models.Student;
//import com.fit3171.allocation.repositories.ProjectRepository;
//import com.fit3171.allocation.repositories.StudentRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
///**
// * This class loads seed data into the database when the Spring
// * application loads up.
// **/
//
//@Slf4j
//@Component
//public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {
//
//    private final ProjectRepository projectRepository;
//    private final StudentRepository studentRepository;
//
//
//
//    public DataLoader(ProjectRepository projectRepository, StudentRepository studentRepository) {
//        this.projectRepository = projectRepository;
//        this.studentRepository = studentRepository;
//    }
//
//    // Load data when the Spring app boots up
//    @Override
//    @Transactional
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        loadProjects();
//        loadStudents();
//        log.debug("Loading data");
//    }
//
//    // Load list of students
//    private void loadStudents() {
//        Student student = new Student();
//        student.setId("27738965");
//        student.setUsername("mmah65");
//        studentRepository.save(student);
//
//        Student student2 = new Student();
//        student2.setId("28538867");
//        student2.setUsername("jlim29");
//        studentRepository.save(student2);
//
//        Student student3 = new Student();
//        student3.setId("23456789");
//        student3.setUsername("nbin45");
//        studentRepository.save(student3);
//
//        Student student4 = new Student();
//        student4.setId("25673421");
//        student4.setUsername("ikfel31");
//        studentRepository.save(student4);
//
//        Student student5 = new Student();
//        student5.setId("23324567");
//        student5.setUsername("ljei67");
//        studentRepository.save(student5);
//
//        Student student6 = new Student();
//        student6.setId("24356456");
//        student6.setUsername("azik89");
//        studentRepository.save(student6);
//    }
//
//    // Load list of projects using data from FIT Honors project site
//    private void loadProjects() {
//        Project project00001 = new Project();
//        project00001.setId("P00001");
//        project00001.setTitle("Digital repositories for Art Archives");
//        project00001.setDescription("How can a living archive be created that not only documents the Monash University Prato Centre (MUPC) Visual Residency Program but also engages artists-in-residence in a direct and active way as part of their residency experience in Prato? In collaboration with Monash University Museum of Art and Monash University Prato Centre, this project aims to help realise the creative possibilities inherent in cross-fertilizing artistic processes with archival theory. It will establish a prototype archival platform that complements contemporary art practices and supports the ability to record, relate and re-vision ephemera and events associated with transformative, creative experience as artefacts themselves.");
//        project00001.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00001.setAimsAndOutline("To develop a prototype digital repository suitable for use by artists participating in the Monash University Prato Artists in Residence Program.");
//        project00001.setPreAndCorequisiteKnowledge("Familiarity with digital repositories and/or open source software and/or archival principles.");
//        project00001.setSupervisors(new ArrayList<String>(Arrays.asList("Tom Denison", "Gillian Oliver")));
//        project00001.setUrlsAndReferences(null);
//        project00001.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00001);
//
//        Project project00058 = new Project();
//        project00058.setId("P00058");
//        project00058.setTitle("Online Handwritten Signature Verification");
//        project00058.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00058.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00058.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00058.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00058.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00058.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00058.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00058);
//
//        Project project00059 = new Project();
//        project00059.setId("P00059");
//        project00059.setTitle("Automatic Sound Generation and Recognition");
//        project00059.setDescription("No research publication in this area but it is related to an industry project.");
//        project00059.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00059.setAimsAndOutline("Some applications require techniques that automatically recognise sounds. Other applications (for example, in digital films) require techniques that can generate any given sound for use in the application. The first part of this project involves developing techniques for sound recognition that detect a wide variety of sounds. The sound recogniser should work even when there is high level of ambient noise. The other part of the project is to develop techniques to generate sounds so that a number of given sounds may be generated from a given list of sounds. Once again it may be necessary to generate sounds for a noisy background environment. The project will involve searching for publications in this area and then perhaps using some ideas from them. The project requires some mathematical knowledge and programming experience.");
//        project00059.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00059.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00059.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("http://www.ee.columbia.edu/~dpwe/talks/HSCMA-2011-06.pdf", "http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.26.964&rep=rep1&type=pdf")));
//        project00059.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00059);
//
//        Project project00060 = new Project();
//        project00060.setId("P00060");
//        project00060.setTitle("The impact of using Business Intelligence in healthcare");
//        project00060.setDescription("Business Intelligence (BI) tools are widely used in many data-intensive organisations to support better decision-making and service delivery. BI tools have been recently adopted as one of the components of the information infrastructure within healthcare context as well. However, the impact of using BI on the healthcare outcomes still needs investigation.");
//        project00060.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18)));
//        project00060.setAimsAndOutline("The project will examining BI tools developments in a large Australian hospital and their impact on the business using a Case study approach.");
//        project00060.setPreAndCorequisiteKnowledge("To tackle this project students need an undergraduate degree in IT (preferably in business information systems) or be a student in the Master of Business Information Systems. Some work experience will be looked at as a bonus.");
//        project00060.setSupervisors(new ArrayList<String>(Arrays.asList("Caddie Gao", "Frada Burstein")));
//        project00060.setUrlsAndReferences(null);
//        project00060.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00060);
//
//        Project project00061 = new Project();
//        project00061.setId("P00061");
//        project00061.setTitle("Visualising Lazy Functional Program Execution");
//        project00061.setDescription("Pure lazy functional programming languages such as Haskell remain the most advanced programming paradigm in common use. Laziness and functional purity allow the compiler to optimise code in much more sophisticated ways than standard imperative language compilers. Haskell syntax is also, arguably, a more natural and concise way to model problems and algorithms for solving them. However, the difficulty for programmers in these types of languages is understanding what is actually happening with such compiled, optimised code when it is executing. This is a serious blocker to wider adoption of the pure functional paradigm. While a lot of the research in functional languages over the years has been devoted to language and compiler design, it seems less effort has gone into developing really “user friendly” practical tools for developers. There is some recent work in this direction (see links to IHaskell and ghc-vis) however much work remains in making such tools informative and interactive.");
//        project00061.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00061.setAimsAndOutline("To develop novel interactive visualisation tools to support programmers in understanding the efficiency and memory use of running haskell programs.");
//        project00061.setPreAndCorequisiteKnowledge("Some knowledge of functional programming would be very useful (ideally haskell, but Lisp/ML/etc are also a good foundation). An interest in graphics, visualisation and software usability would also be advantageous.");
//        project00061.setSupervisors(new ArrayList<String>(Arrays.asList("Tim Dwyer", "Chris Mears")));
//        project00061.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("http://www.haskell.org/haskellwiki/Haskell?http://gibiansky.github.io/IHaskell/demo.html", "http://hackage.scs.stanford.edu/package/ghc-vis-0.2.1")));
//        project00061.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00061);
//
//        Project project00062 = new Project();
//        project00062.setId("P00062");
//        project00062.setTitle("Qualitative investigation of software development team behaviour");
//        project00062.setDescription("The overwhelming majority of academic software engineering research has been highly technical in nature, and focused on the development of tools and methodologies to assist in some particular aspect of the development process, such as formal specification methods, or test case generation tools. Even where attempts have been made to formally study the human aspects of software engineering, structured quantitative approaches have been most common. To explore human behaviour, the social sciences typically use a combination of qualitative and quantitative approaches. Qualitative methods including observation and interviews offer the chance to generate new insights about a domain - in this case software development - which then, if desired, can be investigated further using quantitative approaches.");
//        project00062.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00062.setAimsAndOutline("The aim of this project is to gain insight into the work patterns, interactions, and key challenges facing a software development team in its task. It is hope that this will gain some insight into some of the similarities and differences between the team's nominal development process and what they actually do in practice.\nAt this stage, it is planned to use a mixed-methods qualitative approach, with a period (of 1-2 weeks) of unstructured participant observation of an industrial software development group followed up with semi-structured interviews. Such an approach is similar to ethnographic methods used in anthropology.");
//        project00062.setPreAndCorequisiteKnowledge("Some background in software engineering units is required. Training and guidance in qualitative research methods will be provided.");
//        project00062.setSupervisors(new ArrayList<String>(Arrays.asList("Robert Merkel", "Robyn McNamara", "Narelle Warren (TBC)")));
//        project00062.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("Kanij, T.; Merkel, R.; Grundy, John, 'A Preliminary Study on Factors Affecting Software Testing Team Performance,'", "Empirical Software Engineering and Measurement (ESEM), 2011 International Symposium on , vol., no., pp.359,362, 22-23 Sept. 2011, http://ieeexplore.ieee.org/xpls/abs_all.jsp?arnumber=6092588&tag=1\nhttp://www.umanitoba.ca/faculties/arts/anthropology/courses/122/module1/methods.html")));
//        project00062.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00062);
//
//        Project project00063 = new Project();
//        project00063.setId("P00063");
//        project00063.setTitle("Democratising Big Data: Public Interactive Displays of Sustainability Data");
//        project00063.setDescription("We have access to potentially finely-grained data on energy use around the University and particularly in some key new buildings. We would like to create interesting interactive visualizations that allow people to explore this data.");
//        project00063.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00063.setAimsAndOutline("One possibility is that we set up a public display that can be controlled by passers-by using a Microsoft Kinect interface. Another (complementary) possibility is that we design a mobile or web app that allows people to explore this data on their own device. The point is to raise peoples' awareness of energy usage and efforts to improve sustainability of buildings at Monash. The HCI (Human Computer Interaction) research goal is to explore how novel interactive visualization and effective UI design can engage casual observers.");
//        project00063.setPreAndCorequisiteKnowledge("This project should appeal to students with an interest in graphics and natural user interface design.");
//        project00063.setSupervisors(new ArrayList<String>(Arrays.asList("Lachlan Andrew", "Tim Dwyer", "Ariel Liebman", "Geoff Webb")));
//        project00063.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("http://intranet.monash.edu.au/bpd/services/environmental-sustainability.html")));
//        project00063.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00063);
//
//        Project project00064 = new Project();
//        project00064.setId("P00064");
//        project00064.setTitle("How close are they? Conflict of interest in Academia");
//        project00064.setDescription("Peer review is central to the health of scientific publishing. This requires that the reviewers of a scientific paper be sufficiently independent of the authors. For example, the reviewer should not be a current collaborator, a former student or supervisor, or be working at the same institution.\nHowever, this is not always clear-cut. What if they published together 10 years ago What if they used to work at the same institution? What if they have a close collaborator in common?");
//        project00064.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00064.setAimsAndOutline("This project will develop software to determine whether an academic has a conflict of interest with any of the authors of a document. It will use public databases such as Google Scholar and the mathematics Genealogy Project to determine how close a candidate reviewer is to the authors of a candidate paper.");
//        project00064.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00064.setSupervisors(new ArrayList<String>(Arrays.asList("Lachlan Andrew")));
//        project00064.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("http://scholar.google.com http://genealogy.math.ndsu.nodak.edu/")));
//        project00064.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00064);
//
//        Project project00065 = new Project();
//        project00065.setId("P00065");
//        project00065.setTitle("Where does my electricity go?");
//        project00065.setDescription("Have you ever wondered why your electricity bill is high on a particular month? Smart meters have the potential to tell us which devices consume most of our electricity, but we must coax the information out of them. Smart meters report half-hourly energy use to your retailer, but also can distribute finer time-scale data over a wireless LAN. We would like to \"disaggregate\" this data and determine how much energy is used by individual devices, eg air conditioning, fridges, heating, cooking etc. This helps awareness about usage pattern, hence potentially reducing significantly the electricity consumption.");
//        project00065.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00065.setAimsAndOutline("In this project, we design and develop machine learning techniques suitable for analysing and mining electricity usage data. The ideal model will be able to accommodate other sources of valuable information as well, e.g. time of the day, season, and temperature records. Particularly we explore a powerful statistical model, called Factorial Hidden Markov Models (FHMMs), and augment it with additional components to capture domain knowledge. We will make use of publicly available data in this project (REDD data set from MIT: http://redd.csail.mit.edu).");
//        project00065.setPreAndCorequisiteKnowledge("Basic probability");
//        project00065.setSupervisors(new ArrayList<String>(Arrays.asList("Reza Haffari", "Lachlan Andrew", "Ariel Liebman")));
//        project00065.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("http://redd.csail.mit.edu")));
//        project00065.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00065);
//
//        Project project00066 = new Project();
//        project00066.setId("P00066");
//        project00066.setTitle("Finding Monash's heating and cooling costs");
//        project00066.setDescription("We have access to potentially finely-grained data on energy use around the University and particularly in some key new buildings. We would like to \"disaggregate\" this data further, to identify how much energy is used by different systems, specifically HVAC (heating, ventilation and air conditioning), but also lighting or office equipment.");
//        project00066.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00066.setAimsAndOutline("In this project, we will use a combination of manual sleuthing and data mining techniques to determine what component of Monash's electricity consumption is due to heating and cooling. This will combine the above data set with hourly temperature measurements to try to detect the times at which a building's air conditioning or heating turns on or off, and the power consumption while it is on. The resulting data will be useful for raising awareness about which energy-saving strategies are likely to produce substantial savings. This data will ideally also form the input to a data visualisation project to convey this data to the wider campus community.");
//        project00066.setPreAndCorequisiteKnowledge("Basic probability. Understanding Fourier transforms would be an advantage");
//        project00066.setSupervisors(new ArrayList<String>(Arrays.asList("Lachlan Andrew", "Geoff Webb", "Tim Dwyer", "Ariel Liebman")));
//        project00066.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("http://intranet.monash.edu.au/bpd/services/environmental-sustainability.html")));
//        project00066.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00066);
//
//        Project project00067 = new Project();
//        project00067.setId("P00067");
//        project00067.setTitle("Planning for an uncertain energy future");
//        project00067.setDescription("Electricity grids around the world and in Australian are in the midst of a profound transformation. New technologies such as rooftop solar panels, wind farms, and smart meters are challenging current paradigms in system planning and even threatening existing electricity utility business models.");
//        project00067.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00067.setAimsAndOutline("Electricity utilities, system planners, and governments are facing many future trends that are extremely uncertain. For example there is a great deal of uncertainty about electricity demand growth (or decline) compounded by uncertainty in the rate at which renewable technology costs decline. This project aims to develop optimisation techniques to model the impacts of uncertainty in demand growth, technology costs, and electricity generation feed stocks on optimal investment strategies in renewable technologies in an electricity system. The project will take some of it’s inspiration from the work done by the CSIRO Future Grid Forum.");
//        project00067.setPreAndCorequisiteKnowledge("Project will appeal to student with interest in simulation and modelling with some programming experience. No prior knowledge in optimisation and energy systems required.");
//        project00067.setSupervisors(new ArrayList<String>(Arrays.asList("Aldeida Aleti, Ariel Liebman")));
//        project00067.setUrlsAndReferences(null);
//        project00067.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00067);
//
//        Project project00068 = new Project();
//        project00068.setId("P00068");
//        project00068.setTitle("Software Tools for the Manipulation of 3D Image Content");
//        project00068.setDescription("A software engineering background would be advantageous but is not essential.");
//        project00068.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00068.setAimsAndOutline("Computer displays and televisions built for the presentation of 3D (stereoscopic) content are now becoming commodity hardware products, rather than specialised research support products. The market for 3D products is driven mostly by the entertainment sector, and in computer displays, the dominant market for 3D displays and supporting graphics adaptors is the computer gaming market, with several hundred products now capable of driving a 3D display. Responding to the market, hardware vendors are now producing 3D LED displays for desktop and deskside computers, or high performance notebooks with 3D LED displays and infrared emitters for 3D glasses built into the notebook. Concurrently, stereoscopic (3D) cameras are re-emerging in the market, with two products now available. While hardware for displaying 3D content is now becoming affordable and common, there is a shortage of software tools available for manipulating 3D content, especially 3D digital imagery produced by stereo cameras. Extant proprietary software tools like Photoshop, Aperture, Lightroom, Optics Pro, and GPL tools like GIMP lack proper support, or provide at best rudimentary support for 3D imagery.\nThe aim of this project is to produce an Open Source software tool and capable of converting, parallax adjusting, displaying and exporting imagery in common stereoscopic formats. The tool must be highly portable and integration with GIMP would be highly desirable. The overall objective of the project is to produce an image editor for 3D images. The initial implementation will enable operations to be carried out on 3D images or the fields of stereoscopic images. The tool should be designed in such a way that it can be turned into a full editing tool that will allow operations to be carried out on components of images. It is expected the prototype will operate on nVidia 3D adaptors and 120 Hz 3D monitors.");
//        project00068.setPreAndCorequisiteKnowledge("A student will not need to have studied image processing or computer graphics at undergraduate level");
//        project00068.setSupervisors(new ArrayList<String>(Arrays.asList("Peter Tischer", "Carlo Kopp")));
//        project00068.setUrlsAndReferences(null);
//        project00068.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00068);
//
//        Project project00069 = new Project();
//        project00069.setId("P00069");
//        project00069.setTitle("Complex and Clever Metadata Architectures for Research Data Management");
//        project00069.setDescription("Metadata is one of the conundrums facing those designing and developing advanced scholarly information infrastructures to facilitate distributed, data intensive, collaborative research. Any infrastructure for heterogeneous data sharing must be able to cope with a plethora of metadata ontologies, schemas, standards, representations and encodings, as one-size-fits-all approaches suffer in terms of metadata quality and usefulness. They do not provide the degree of specificity needed for efficient and effective discovery, access, interpretation and use.");
//        project00069.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00069.setAimsAndOutline("This research project will investigate the design of a metadata management architecture for a research hub that can cope with complexity and diversity, mapping and managing commensurability, as well as allowing for necessary specialisation and extension, in order to facilitate sharing and re-use of research data.");
//        project00069.setPreAndCorequisiteKnowledge(null);
//        project00069.setSupervisors(new ArrayList<String>(Arrays.asList("Joanne Evans", "Yuan-Fang Li", "Tom Denison", "Henry Linger")));
//        project00069.setUrlsAndReferences(null);
//        project00069.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00069);
//
//        Project project00070 = new Project();
//        project00070.setId("P00070");
//        project00070.setTitle("Simulating batteries in smart grid");
//        project00070.setDescription("Electricity grids around the world and in Australian are in the midst of a profound transformation. New technologies such as rooftop solar panels, wind farms, and smart meters are challenging current paradigms in system planning and even threatening existing electricity utility business models.");
//        project00070.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00070.setAimsAndOutline("This project aims to model the integration of batteries into the smart grid using cloud based high performance computing. The model incorporates an industry standard power system simulation tool called Plexos configured to find the optimal investment in renewable generation technologies in a complex electricity network. The project will entail incorporating models of a range of new battery technologies to determine whether batteries can significantly improve the cost of investing in renewable and other low carbon energy technologies.");
//        project00070.setPreAndCorequisiteKnowledge("Projct will appeal to student with interest in simulation, business decision making and modelling. No prior knowledge in optimisation and energy systems required.");
//        project00070.setSupervisors(new ArrayList<String>(Arrays.asList("Vincent Lee", "Ariel Liebman", "John Betts")));
//        project00070.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("http://www.csiro.au/Organisation-Structure/Flagships/Energy-Flagship/Future-Grid-Forum-brochure.aspx")));
//        project00070.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00070);
//
//        Project project00071 = new Project();
//        project00071.setId("P00071");
//        project00071.setTitle("Beating the World Record on Freight Transport Problems");
//        project00071.setDescription("The vehicle routing problem with time windows has been tackled by groups all over the world using all kinds of optimisation approaches. These approaches are validated and compared against a set of problem instances published at SINTEF. The major optimisation company Quintiq publishes their best results on their website.");
//        project00071.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00071.setAimsAndOutline("The recent method of guided ejection chains has been successful on several transport applications, and another method based on large neighbourhood search was used in Richard Kelly's recent PhD to obtain world-class results, with a couple of world records. This project will experiment with a combination of guided ejection search and large neighbourhood search to obtain new world records.\nThe expected outcomes of this project are:\nNew world-best results on vehicle routing with time window benchmarks;\nA publication comparing our results with Quintiq's\nAn efficiently implemented guided ejection search implementation");
//        project00071.setPreAndCorequisiteKnowledge("Experience in programming in C++, an interest in optimisation technology, and the desire to win!");
//        project00071.setSupervisors(new ArrayList<String>(Arrays.asList("Mark Wallace", "Richard Kelly")));
//        project00071.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("Quintiq World Records: http://www.quintiq.com/optimization/vrptw-world-records.html", "SINTEF VRPTW Benchmarks: http://www.sintef.no/Projectweb/TOP/VRPTW/", "Nagata, Y., & Bräysy, O. (2009). A powerful route minimization heuristic for the vehicle routing problem with time windows. Operations Research Letters, 37(5), 333-338.", "Pisinger, D., & Ropke, S. (2007). A general heuristic for vehicle routing problems. Computers & operations research, 34(8), 2403-2435.")));
//        project00071.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00071);
//
//        Project project00072 = new Project();
//        project00072.setId("P00072");
//        project00072.setTitle("ERP in the Cloud by SMEs");
//        project00072.setDescription("Little research has been conducted to assess the effectiveness or otherwise of adopting ERP in the cloud in SMEs");
//        project00072.setCreditPoints(new ArrayList<Integer>(Arrays.asList(18, 24)));
//        project00072.setAimsAndOutline("To identify the critical issues that affect organisations that conduct their ERP systems in the cloud");
//        project00072.setPreAndCorequisiteKnowledge("Enterprise information systems knowledge would be an advantage");
//        project00072.setSupervisors(new ArrayList<String>(Arrays.asList("Sue Foster")));
//        project00072.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("Business Process Management Journal, 11(2), 158-170.\nKlause, H. & Rosemann, M. (2000). What is enterprise resource planning? Information Systems Frontiers (special issue of The Future of Enterprise Resource Planning Systems), 2 (2), 141-162.", "Lewis, P. J. (1993). Linking Soft Systems Methodology with Data-focused Information Systems Development, Journal of Information Systems, Vol. 3, 169-186.", "Markus, M.L., Axline, S., Petrie, D., & Tanis, C. (2000) Learning from adopters' experiences with ERP: problems encountered and success achieved. Journal of Information Technology , 15, 245-265.", "Nolan, & Norton Institute. (2000). SAP Benchmarking Report 2000, KPMG Melbourne.", "Queensland Health Corporate Publications: Change management Documents: Located at http://www.health.qld.gov.au/publications/change_management/", "Parr., A. & Shanks, G. (2000). A model of ERP project implementation. Journal of Information Technology, 15, 289-303.", "Ross, J. W. (1999). \"The ERP Revolution: Surviving Versus Thriving, Centre for Information System Research, Sloan School of Management, MA, August 1999.", "Scott, J. E., & Vessey, I. (2002). Managing risks in enterprise systems implementations. Communications of the ACM, April, Vol. 45, No 4. Retrieved on 19 March 2010,", "Located at: http://delivery.acm.org/10.1145/510000/505249/p74-scott.pdf?key1=505249&key2=8269509621&coll=GUIDE&dl=GUIDE&CFID=80880926&CFTOKEN=57269991", "Sedera, D., Gable, G., & Chan., T. (2003). Measuring Enterprise Systems Success: A Preliminary Model. Ninth Americas Conference on Information Systems, 476-485.", "Shang, S., & Seddon, P. B. (2002). Assessing and managing the benefits of enterprise systems: the business manager's perspective. Information Systems Journal. 12, pp 271-299.", "Shang, S. & Seddon, P. B. (2000). \"A comprehensive framework for classifying the benefits of ERP systems\" in the proceedings of the twenty third Americas Conference on Information Systems. 1229-1698.", "Skok, W., & Legge, M. (2001). Evaluating Enterprise Resource Planning (ERP) Systems using an Interpretive Approach. ACM., SIGCPR, San Diego. 189-197. (Benefit realisation", "Sumner, M. (2000). \"Risk factors in enterprise-wide/ERP projects.\" Journal of Information Technology 15(4): 317 - 327.", "Titulair, H. B., Oktamis, S., and Pinsonneault, A. (2005). Dimensions of ERP implementations and their impact on ERP Project outcomes. Journal of Information Technology Management. XVI, 1. Located at http://jitm.ubalt.edu/XVI-1/article1.pdf")));
//        project00072.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00072);
//
//        Project project00073 = new Project();
//        project00073.setId("P00073");
//        project00073.setTitle("Online Handwritten Signature Verification");
//        project00073.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00073.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00073.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00073.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00073.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00073.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00073.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00073);
//
//        Project project00074 = new Project();
//        project00074.setId("P00074");
//        project00074.setTitle("Online Handwritten Signature Verification");
//        project00074.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00074.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00074.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00074.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00074.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00074.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00074.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00074);
//
//        Project project00075 = new Project();
//        project00075.setId("P00075");
//        project00075.setTitle("Online Handwritten Signature Verification");
//        project00075.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00075.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00075.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00075.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00075.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00075.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00075.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00075);
//
//        Project project00076 = new Project();
//        project00076.setId("P00076");
//        project00076.setTitle("Online Handwritten Signature Verification");
//        project00076.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00076.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00076.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00076.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00076.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00076.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00076.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00076);
//
//        Project project00077 = new Project();
//        project00077.setId("P00077");
//        project00077.setTitle("Online Handwritten Signature Verification");
//        project00077.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00077.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00077.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00077.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00077.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00077.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00077.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00077);
//
//        Project project00078 = new Project();
//        project00078.setId("P00078");
//        project00078.setTitle("Online Handwritten Signature Verification");
//        project00078.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00078.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00078.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00078.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00078.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00078.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00078.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00078);
//
//        Project project00079 = new Project();
//        project00079.setId("P00079");
//        project00079.setTitle("Online Handwritten Signature Verification");
//        project00079.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00079.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00079.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00079.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00079.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00079.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00079.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00079);
//
//        Project project00080 = new Project();
//        project00080.setId("P00080");
//        project00080.setTitle("Online Handwritten Signature Verification");
//        project00080.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00080.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00080.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00080.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00080.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00080.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00080.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00080);
//
//        Project project00081 = new Project();
//        project00081.setId("P00081");
//        project00081.setTitle("Online Handwritten Signature Verification");
//        project00081.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00081.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00081.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00081.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00081.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00081.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00081.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00081);
//
//        Project project00082 = new Project();
//        project00082.setId("P00082");
//        project00082.setTitle("Online Handwritten Signature Verification");
//        project00082.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00082.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00082.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00082.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00082.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00082.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00082.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00082);
//
//        Project project00083 = new Project();
//        project00083.setId("P00083");
//        project00083.setTitle("Online Handwritten Signature Verification");
//        project00083.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00083.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00083.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00083.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00083.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00083.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00083.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00083);
//
//        Project project00084 = new Project();
//        project00084.setId("P00084");
//        project00084.setTitle("Online Handwritten Signature Verification");
//        project00084.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00084.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00084.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00084.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00084.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00084.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00084.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00084);
//
//        Project project00085 = new Project();
//        project00085.setId("P00085");
//        project00085.setTitle("Online Handwritten Signature Verification");
//        project00085.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00085.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00085.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00085.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00085.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00085.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00085.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00085);
//
//        Project project00086 = new Project();
//        project00086.setId("P00086");
//        project00086.setTitle("Online Handwritten Signature Verification");
//        project00086.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00086.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00086.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00086.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00086.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00086.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00086.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00086);
//
//        Project project00087 = new Project();
//        project00087.setId("P00087");
//        project00087.setTitle("Online Handwritten Signature Verification");
//        project00087.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00087.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00087.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00087.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00087.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00087.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00087.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00087);
//
//        Project project00088 = new Project();
//        project00088.setId("P00088");
//        project00088.setTitle("Online Handwritten Signature Verification");
//        project00088.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00088.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00088.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00088.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00088.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00088.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00088.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00088);
//
//        Project project00089 = new Project();
//        project00089.setId("P00089");
//        project00089.setTitle("Online Handwritten Signature Verification");
//        project00089.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00089.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00089.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00089.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00089.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00089.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00089.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00089);
//
//        Project project00090 = new Project();
//        project00090.setId("P00090");
//        project00090.setTitle("Online Handwritten Signature Verification");
//        project00090.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00090.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00090.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00090.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00090.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00090.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00090.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00090);
//
//        Project project00091 = new Project();
//        project00091.setId("P00091");
//        project00091.setTitle("Online Handwritten Signature Verification");
//        project00091.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00091.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00091.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00091.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00091.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00091.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00091.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00091);
//
//        Project project00092 = new Project();
//        project00092.setId("P00092");
//        project00092.setTitle("Online Handwritten Signature Verification");
//        project00092.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00092.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00092.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00092.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00092.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00092.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00092.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00092);
//
//        Project project00093 = new Project();
//        project00093.setId("P00093");
//        project00093.setTitle("Online Handwritten Signature Verification");
//        project00093.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00093.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00093.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00093.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00093.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00093.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00093.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00093);
//
//        Project project00094 = new Project();
//        project00094.setId("P00094");
//        project00094.setTitle("Online Handwritten Signature Verification");
//        project00094.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00094.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00094.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00094.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00094.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00094.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00094.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00094);
//
//        Project project00095 = new Project();
//        project00095.setId("P00095");
//        project00095.setTitle("Online Handwritten Signature Verification");
//        project00095.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00095.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00095.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00095.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00095.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00095.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00095.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00095);
//
//        Project project00096 = new Project();
//        project00096.setId("P00096");
//        project00096.setTitle("Online Handwritten Signature Verification");
//        project00096.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00096.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00096.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00096.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00096.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00096.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00096.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00096);
//
//        Project project00097 = new Project();
//        project00097.setId("P00097");
//        project00097.setTitle("Online Handwritten Signature Verification");
//        project00097.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00097.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00097.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00097.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00097.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00097.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00097.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00097);
//
//        Project project00098 = new Project();
//        project00098.setId("P00098");
//        project00098.setTitle("Online Handwritten Signature Verification");
//        project00098.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00098.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00098.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00098.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00098.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00098.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00098.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00098);
//
//        Project project00099 = new Project();
//        project00099.setId("P00099");
//        project00099.setTitle("Online Handwritten Signature Verification");
//        project00099.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00099.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00099.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00099.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00099.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00099.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00099.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00099);
//
//        Project project00100 = new Project();
//        project00100.setId("P00100");
//        project00100.setTitle("Online Handwritten Signature Verification");
//        project00100.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00100.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00100.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00100.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00100.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00100.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00100.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00100);
//
//        Project project00101 = new Project();
//        project00101.setId("P00101");
//        project00101.setTitle("Online Handwritten Signature Verification");
//        project00101.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00101.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00101.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00101.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00101.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00101.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00101.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00101);
//
//        Project project00102 = new Project();
//        project00102.setId("P00102");
//        project00102.setTitle("Online Handwritten Signature Verification");
//        project00102.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00102.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00102.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00102.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00102.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00102.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00102.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00102);
//
//        Project project00103 = new Project();
//        project00103.setId("P00103");
//        project00103.setTitle("Online Handwritten Signature Verification");
//        project00103.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00103.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00103.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00103.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00103.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00103.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00103.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00103);
//
//        Project project00104 = new Project();
//        project00104.setId("P00104");
//        project00104.setTitle("Online Handwritten Signature Verification");
//        project00104.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00104.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00104.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00104.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00104.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00104.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00104.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00104);
//
//        Project project00105 = new Project();
//        project00105.setId("P00105");
//        project00105.setTitle("Online Handwritten Signature Verification");
//        project00105.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00105.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00105.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00105.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00105.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00105.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00105.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00105);
//
//        Project project00106 = new Project();
//        project00106.setId("P00106");
//        project00106.setTitle("Online Handwritten Signature Verification");
//        project00106.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00106.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00106.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00106.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00106.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00106.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00106.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00106);
//
//        Project project00107 = new Project();
//        project00107.setId("P00107");
//        project00107.setTitle("Online Handwritten Signature Verification");
//        project00107.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00107.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00107.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00107.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00107.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00107.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00107.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00107);
//
//        Project project00108 = new Project();
//        project00108.setId("P00108");
//        project00108.setTitle("Online Handwritten Signature Verification");
//        project00108.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00108.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00108.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00108.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00108.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00108.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00108.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00108);
//
//        Project project00109 = new Project();
//        project00109.setId("P00109");
//        project00109.setTitle("Online Handwritten Signature Verification");
//        project00109.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00109.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00109.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00109.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00109.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00109.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00109.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00109);
//
//        Project project00110 = new Project();
//        project00110.setId("P00110");
//        project00110.setTitle("Online Handwritten Signature Verification");
//        project00110.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00110.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00110.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00110.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00110.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00110.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00110.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00110);
//
//        Project project00111 = new Project();
//        project00111.setId("P00111");
//        project00111.setTitle("Online Handwritten Signature Verification");
//        project00111.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00111.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00111.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00111.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00111.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00111.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00111.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00111);
//
//        Project project00112 = new Project();
//        project00112.setId("P00112");
//        project00112.setTitle("Online Handwritten Signature Verification");
//        project00112.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00112.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00112.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00112.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00112.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00112.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00112.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00112);
//
//        Project project00113 = new Project();
//        project00113.setId("P00113");
//        project00113.setTitle("Online Handwritten Signature Verification");
//        project00113.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00113.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00113.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00113.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00113.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00113.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00113.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00113);
//
//        Project project00114 = new Project();
//        project00114.setId("P00114");
//        project00114.setTitle("Online Handwritten Signature Verification");
//        project00114.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00114.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00114.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00114.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00114.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00114.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00114.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00114);
//
//        Project project00115 = new Project();
//        project00115.setId("P00115");
//        project00115.setTitle("Online Handwritten Signature Verification");
//        project00115.setDescription("This project is in an area of my earlier research. A number of research papers were published.");
//        project00115.setCreditPoints(new ArrayList<Integer>(Arrays.asList(24)));
//        project00115.setAimsAndOutline("There is considerable interest in authentication based on handwritten signature verification (HSV) because HSV is superior to many other biometric authentication techniques , for example, fingerprints or retinal pattern which are more reliable but much more intrusive.\n A number of HSV techniques have been explored over the last 30-40 years. I myself have looked into using dynamic parameters when a signature is signed online. Another approach was based on simulating the hand movements of the person signing online. Both these techniques work well and the results have been published. This project involves finding even more reliable techniques perhaps by exploring yet another approach to online HSV based on identifying curves and straight lines as the signature is signed. You will need to study curves and lines identification techniques in pattern recognition and then use those techniques and perhaps develop new techniques for use in online HSV. The project requires some mathematical knowledge and programming experience.");
//        project00115.setPreAndCorequisiteKnowledge("The student must have some mathematical background and experience in programming");
//        project00115.setSupervisors(new ArrayList<String>(Arrays.asList("Gopal Gupta")));
//        project00115.setUrlsAndReferences(new ArrayList<String>(Arrays.asList("(with R. C. Joyce) Using Position Extrema Points to Capture Shape in On-line Handwritten\nSignature Verification, Pattern Recognition, Vol. 40 pp 2811-2817, 2007", "The State of the Art in On-line Handwritten Signature Verification, approx 38pp,\nFaculty of Information Technology, Technical Report, 2006")));
//        project00115.setFieldsOfStudy(new ArrayList<String>(Arrays.asList("Art", "Archival theory", "Digital repositories", "Open source")));
//        projectRepository.save(project00115);
//    }
//}
//
