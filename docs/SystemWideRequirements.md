
# Introduction

The system to be built is a large enterprise application used to manage honors projects for Monash University. It will consist of modules that will interact with each other through a service protocol - in other words, a service-oriented architecture. This document is meant to outline all the system-wide requirements this application must fulfill in order to meet client expectations.

# System-Wide Functional Requirements
- Authentication: A user must be authenticated as a Monash Honors/Masters candidate or a faculty member with the prerequisite permissions before being permitted access to the system.


- User Roles: A faculty member must have different access rights and responsibilities from those of a student. There must also be an Admin Role for the Honors Coordinator


# System Qualities


## Usability

The quality of a user interface can be the difference between success and failure. A user should be able to connect every UI element with its purpose intuitively - they should not have to think deeply about what they are doing. The system will be designed with this tenet in mind, and make it so that the user experience is as unobtrusive as possible. The key features the system should provide are listed below:


- The system needs to account for people with disabilities, such as color blindness
- The system should be as simple as possible to reduce cognitive load in daily use
- The system needs to space UI elements so that the users' attention is immediately drawn to the most important information
- The system should utilize fonts in such a way as to increase clarity and smooth over the user experience
- The UI elements should be consistent to help reduce the learning curve for using the system
- The system needs to provide feedback to the user as frequently as possible to make sure they always know what to do next
- The system should provide defaults whenever possible, such as automatically filling certain fields on a form, to reduce the work users have to do

## Reliability

The application has a large user base, and will likely have many concurrent users at any given time. It may also be accessed at any given time of the day through a whole year. The system will also have major consequences for errors, given that it is being used to manage honors projects and that many students' final grades depend on this system. Given these requirements, it is easy to see that the application must be highly available and must handle any possible errors such that they don't affect any users adversely. The key features the system should provide are listed below:


- The system must save all data in case of a power failure. It may also be possible to keep it running on an alternate power source, though the feasibility of this is yet to be determined.
- They system must make daily backups of all information. These must be stored on the cloud and on local storage, with the local backups being stored in different places to avoid a single point of failure in the case of hazards such as a fire outbreak.
- The system must be serviceable so that if, by any chance, it becomes inaccessible, staff can be called in during Monash working hours to fix it. By Esolutions' standards, this system would be classified as a Class B/C service.
- The system should avoid having a centralized database to negate the possibility of a single point of failure
- The system should prevent any invalid operations from being performed, and aim to preserve data integrity as a top priority

## Performance

The system is not estimated to be particularly performance-intensive. It is going to be manipulating mainly text and numbers, and maybe a few images and videos. This does not add up to a significant overhead, so we can be relatively lax when it comes to optimization. However, we will make sure to keep the system responsive and fast enough to maintain the user experience. The key features the system should provide are listed below:


- The system should respond quickly to user input and return results with negligible delay.
- The system should be fluid when moving between different pages on the site.

## Maintainability

At the moment, the system is meant to only manage honors projects for the Faculty of Information Technology. However, as the system is worked upon, ease of extensibility will be a top priority, ensuring that the system can be modified to accommodate other faculties as well. Not only that, the design is to be made so as to ensure that any functionality that is deemed necessary and is discovered after the project has been completed can be added without changing the existing code. This will allow the system to adapt to user requirements and remain relevant even years after its debut. The key features the system should provide are listed below:

- The system classes will be designed using object-oriented design principles such as SOLID to ensure that there is low coupling between classes and to encourage reuse
- The system packages will group related classes together to control dependencies
- The system will utilize design patterns in appropriate situations to increase extensibility
- The system will be split into modules that interact through a service protocol to encourage reuse and avoid having a single point of failure


## Security

Security is essential for the system, as it will deal with sensitive information such as the details of students and faculty, as well as project information that, if leaked, would be disastrous. Ensuring that the system is protected from malicious penetration is a top priority. The measures the system should take are listed below:

- In-depth penetration testing should be done to root out vulnerabilities within the system
- Data input should be sanitized to protect the system against exploits such as SQL injection
- Single sign-on and sign-off should be used for access control
- Passwords should be hashed instead of being encrypted to avoid the possibility of hackers cracking the used cipher
- Require authentication on every webpage of the system if not logged in
- Update development tools when there is a security patch to avoid vulnerabilities being exposed
- Disallow execution of scripts that are not hosted on the domain to guard against XSS attacks
- Perform validation on both browser and server sides to prevent undesirable results
- Inspect uploaded files to make sure they are not malicious
- Use HTTPS to communicate securely
- Perform automated security testing using security tools such as OpenVAS


# System Constraints

There aren't too many constraints on the development of the system. The languages and frameworks to be used were largely left up to the development team, with the caveat that if we wanted ESolutions to be able to manage the system, we'd have to use one of the following languages - Javascript, PHP, Java or C#.


The final couple of constraints are that the system has to be hosted on the cloud (therefore we need to keep hosting and cloud platform service costs in mind while developing the system) and that it needs to have a service-oriented architecture that has its modules interacting with each other through a service protocol.

# System Documentation

Each team will be working on its own individual module, and API documentation will need to be created for each module for communication and integration between the individual modules.

Each team member will be expected to create documentation for the tasks that they will be working on. Creating documentation is expected to be a process that is integrated into the development workflow - it should not be delegated to the end of the project lifecycle.

Class-level and method-level documentation are the minimum requirements. Any complex algorithms used must be explained clearly enough that developers not experienced with them can understand the concepts behind them and be able to find resources for more in-depth understanding with ease.

The API documentation must be easily understandable by the other teams involved, and vice versa for their modules' API docs. It should be extensive enough that teams can figure out how to use the fundamental functionality of the modules with a moderately thorough scan of the documentation - teams should not feel the need to bombard the developers of a module with a barrage of questions about its interface.
