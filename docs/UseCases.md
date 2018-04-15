# Table of Contents
- [Use Cases](#use-cases)
    - [Student selects a project](#student-selects-project)
        - [Overview](#student-selects-project-overview)
        - [Typical Course of Events](#student-selects-project-course)
        - [Alternative Courses of Events](#student-selects-project-course-alt)
    - [Search for a Project](#search-project)
        - [Overview](#search-project-overview)
        - [Typical Course of Events](#search-project-typical)
        - [Alternative Courses of Events](#search-project-alternatives)
    
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

<a name="search-project"></a>
## Search for project

<a name="search-project-overview"></a>
### Overview

Attribute | Description
--- | ---
Use Case | Search for a project based on some criteria
Actors | User (initiator) (Can be anybody using the system)
Purpose | To find a project that meets the criteria the user has defined
Overview | This use case begins when the user decides they want to find a project that meets a certain set of criteria. They enter text that describes what they are looking for, and the system returns a list of projects that fit that description
Type | Primary
Cross-References | None
Pre-conditions | None
Post-conditions | The system must return  a project or a list of projects that meet the user-defined criteria

<a name="search-project-typical"></a>
### Typical Course of Events

Actor Response | System Response
:---: | :---:
1) This use case begins when the user decides that they need to find a project that meets certain criteria |
2) The user types some key words or phrases that relate to the project they are looking for into a text field |
 | 3) The system looks through the stored projects, looking for the search text in each field, including the project description
 | 4) The system returns a list of projects that meet the criteria defined by the search text

<a name="search-project-alternatives"></a>
### Alternative Course of Events

- If the user enters text that cannot be found within any project, the system responds with a message indicating that no projects can be found that match the criteria, and the user is asked to try again
- If the user enters text that isn't valid, i.e. a string of special characters such as '#@%', the system should display a message asking the user to provide valid text only  

<a name="filter-projects"></a>
## Filter projects by categories

<a name="filter-projects-overview"></a>
### Overview

Attribute | Description
--- | ---
Use Case | Filter projects by categories such as domain, supervisors, etc.
Actors | User (initiator) (Can be anybody using the system)
Purpose | To filter projects to show only those that fit into certain categories
Overview | This use case begins when the user decides they want to filter projects so that only those that fit into certain categories are displayed. They can select projects that are in a certain domain or ones with a particular supervisor, and the system will respond by displaying the projects that fit into those categories
Type | Secondary
Cross-References | None
Pre-conditions | None
Post-conditions | The system must return a list of projects that fit the given categories

<a name="filter-projects-typical"></a>
### Typical Course of Events

Actor Response | System Response
:---: | :---:
1) This use case begins when the user decides that they need to filter projects to show only those that fit into certain categories |
2) The user can select categories such as the domain of the project, the supervisors, chief examiners or any other staff managing the project, etc. |
 | 3) The system will filter the projects based on the selected categories, and return a list of projects that fit the selected categories

<a name="filter-projects-alternatives"></a>
### Alternative Course of Events

- If there are no projects that fit the chosen categories, the system will display an appropriate message and ask the user to broaden the scope of the filter

<a name="allocate-projects"></a>
## Co-ordinator allocates members to project

<a name="allocate-projects-overview"></a>
### Overview

Attribute | Description
--- | ---
Use Case | Co-ordinator allocates students and supervisors to projects
Actors | Co-ordinator (initiator), Students, Supervisors
Purpose | To allocate students and supervisors to projects based on their preferences and abilities
Overview | This use case begins when the Honors Co-ordinator decides to allocate students and supervisors to a project. They take their preferences, time of preference submission and abilities and relation to the project domain into account when making their decisions.
Type | Primary
Cross-references | None
Pre-conditions | Students and Supervisors must have submitted their preferences for projects
Post-conditions | Both students and supervisors must be allocated to the correct projects

<a name="allocate-projects-typical"></a>
### Typical Course of Events

Actor Response | System Response
:---: | :---:
1) This use case begins when the co-ordinator decides they want to allocate students and supervisors to a project |
2) They search for a project to allocate members to |
 | 3) The system gives the co-ordinator a list of students and supervisors who have listed their preferences for that project
4) The co-ordinator selects the most appropriate students and supervisors and allocates them to the project |
 | 5) The system notifies the students and supervisors that they have been allocated to that project

<a name="allocate-projects-alternatives"></a>
### Alternative Course of Events

- If no preferences have been submitted for a project by students or supervisors, the system displays an appropriate message to the co-ordinator and informs him to try again at a later date

<a name="shortlist-projects"></a>
## Students Shortlist Projects That They Want To Take

<a name="shortlist-projects-overview"></a>
### Overview

Attribute | Description
--- | ---
Use Case | Students shortlist projects that they are interested in to be viewed later
Actors | Student (initiator)
Purpose | To allow students to save the projects that they are interested in to make it easier for them to decide which one to pick later
Overview | This use case begins when a student finds a project that they are interested in and want to consider taking up a project
Type | Primary
Cross-references | None
Pre-conditions | Students must be eligible to take the project
Post-conditions | Project is saved into that student's shortlist

<a name="shortlist-projects-typical"></a>
### Typical Course of Events

Actor Response | System Response
:---: | :---:
1) This use case begins when the student decides to shortlist a certain project |
2) They click the shortlist button on the project page |
 | 3) The system saves that project into the student's shortlist and notifies the student


<a name="shortlist-projects-alternatives"></a>
### Alternative Course of Events

- If the student is not eligible to take up the project, the system will notify the student of that case and will not save it into the student's shortlist


<a name="check-supervisor-profile"></a>
## Check on supervisor's profile

<a name="check-supervisor-profile-overview"></a>
### Overview

Attribute | Description
--- | ---
Use Case | Check on supervisor's profile for their research areas, projects offered, projects completed, etc
Actors | User (initiator) (Can be anyone)
Purpose | To view more details about the supervisor
Overview | This use case begins when a user wants to know more about a supervisor
Type | Primary
Cross-references | None
Pre-conditions | None
Post-conditions | The selected supervisor's profile is shown to the user

<a name="check-supervisor-profile-typical"></a>
### Typical Course of Events

Actor Response | System Response
:---: | :---:
1) This use case begins when the user wants to know more about a supervisor |
2) The user clicks on the supervisor's profile that he/she wants to know |
 | 3) The system loads the data of the supervisor from the database
 | 4) The system brings the user to a new page that contain the details of the supervisor


<a name="check-supervisor-profile-alternatives"></a>
### Alternative Course of Events
