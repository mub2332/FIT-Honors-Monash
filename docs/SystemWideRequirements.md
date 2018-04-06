
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
