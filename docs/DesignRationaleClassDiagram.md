=====================================================================

## Design Rationale for Class Diagram

=====================================================================

For the class diagram, our team use the Model-View-Controller(MVC) design pattern because in this pattern, Model and View are independent to each other. Meaning, our team can split the tasks into back end and front end separately and each part will not intefere the other part's progress.

In the Controller package, we have a MainController class to get data from Model and update it on View, or get user input from View and use the user input to get data from Model, and update it on View.

The View package contain the UI file which Controller has the permission to update it or get data from it.

The Model package manages the behavior and data of the application. Within the Model package, there is a ProjectCollection class which contain all the projects offered to students. Apart from that, Staff, Student, Guest, Coordinator and Supervisor are User, so those classes inherit from User class. The User class and Project class have a association relationship because one project can be allocated by a Coordinator to a Student.
