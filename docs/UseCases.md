
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

<a name="student-updates-project-course-alt"></a>
### Alternative Courses of Events
