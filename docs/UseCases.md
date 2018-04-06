
# Table of Contents
- [Use Cases](#use-cases)
    1. [Student selects a project](#student-selects-project)
        - [Overview](#student-selects-project-overview)
        - [Typical Course of Events](#student-selects-project-course)
        - [Alternative Courses of Events](#student-selects-project-course-alt)
    2. [Student updates project progress](#student-updates-project)
        - [Overview](#student-updates-project-overview)
        - [Typical Course of Events](#student-updates-project-course)
        - [Alternative Courses of Events](#student-updates-project-course-alt)

<a name="use-cases"></a>
# Use Cases

<a name="student-selects-project"></a>
## Student selects a project

<a name="student-selects-project-overview"></a>
### Overview


 Attribute | Description
 --- | ---
 Use Case | A student selects a project for their thesis
 Actors | Student (initiator), Supervisors
 Purpose | Select a project for a thesis
 Overview | The use case begins when a student decides to select a project to work on for a thesis. They must select a project from a list of available projects. Once they have made their selection, the system must check for their eligibility. If eligible, the student will start working on the project and the supervisors will be notified that the project has been undertaken.
 Type | Primary
 Cross-References | Use Case: Search for projects
 Pre-conditions | Student must be logged in
 Post-conditions | The project the student selects must be marked as in-progress and be removes from the list of available projects


<a name="student-selects-project-course"></a>
### Typical Course of Events

 Actor Response | System Response
 :---: | :---:
 1) This use case begins when a student decides to select a project to work on |
 2) The user searches through a list of projects, and selects the one they want to take |
  | 3) The system checks for eligibility, and allocates the student to the project if eligible.
  | 4) The system then notifies the staff associated with the project that this project has been taken
  | 5) The system marks the project as in-progress, and removes it from the list of available projects

<a name="student-selects-project-course-alt"></a>
### Alternative Courses of Events

- If the student is not logged in, they are prompted to do so before being allowed to select a project
- If the student does not meet the eligibility requirements for a project they have selected, they are informed by a message and advised to select a different project

<a name="student-updates-project"></a>
## Student updates project progress

<a name="student-updates-project-overview"></a>
### Overview

Attribute | Description
--- | ---
Use Case | A student updates the progress of the project they are working on
Actors | Student (initiator)
Purpose | To update information about the project
Overview | The use case begins when a student decided they want the system to reflect their current progress on the project.
Type | Secondary
Cross-References | None
Pre-conditions | Student must be allocated to a project
Post-conditions | The project progress must be saved to the system and be available for view by the student and supervisors

<a name="student-updates-project-course"></a>
### Typical Course of Events
Actor Response | System Response
:---: | :---:
1) This use case begins when a student decides they want to update the progress of the project they are working on |
2) A project has a checklist of items that are to be completed, which the student checks off as needed |
 | 3) The system checks if the items checked off are completed
 | 4) The system updates the progress based on how many items on the checklist are completed
5) The student can add/remove items on the checklist at any time |
 | 6) The system updates the progress accordingly whenever the checklist is modified

<a name="student-updates-project-course-alt"></a>
### Alternative Courses of Events
- If the supervisor decides a task that the student has tagged as complete is not done yet, they can update the progress to reflect that

## Search for project

### Overview

Attribute | Description
--- | ---
Use Case | Search for a project based on some criteria
Actors | User (initiator) (Can be anybody using the system)
Purpose | To find a project that meets the criteria the user has defined
Overview | This use case begins when the user decides they want to find a project that meets a certain set of criteria
Type | Primary
Cross-References | None
Pre-conditions | None
Post-conditions | The system must return  a project or a list of projects that meet the user-defined criteria

### Typical Course of Events

Actor Response | System Response
:---: | :---:
1) This use case begins when the user decides that they need to find a project that meets certain criteria |
2) The user types some key words or phrases that relate to the project they are looking for into a text field |
 | 3) The system looks through the stored projects, looking for the search text in each field, including the project description
 | 4) The system returns a list of projects that meet the criteria defined by the search text

### Alternative Course of Events

- If the user enters text that cannot be found within any project, the system responds with a message indicating that no projects can be found that match the criteria, and the user is asked to try again
- If the user enters text that isn't valid, i.e. a string of special characters such as '#@%', the system should display a message asking the user to provide valid text only  
