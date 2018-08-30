=====================================================================

## Design Rationale for Class Diagram

=====================================================================

For the class diagram, our team use the Model-View-Controller(MVC) design pattern because in this pattern, Model and View are independent to each other. Meaning, our team can split the tasks into back end and front end separately and each part will not intefere the other part's progress.

The View package contain the UI file which Controller has the permission to update it or get data from it.

The Model package manages the behavior and data of the application. Within the Model package, there is a Project class which contain the detail of a project that is going to be offered to students. Apart from that, Staff, Student, Coordinator and Supervisor are User, so those classes inherit from User class. The User class and Project class have a association relationship because one project can be allocated by a Coordinator to a Student.

In the Controller package, we have a ProjectController class to get data from Model and update it on View, or get user input from View and use the user input to get data from Model, and update it on View. We have Services package which a service will get a signal from ProjectController. After receiving signal, the service will use a query method from Repositories package to get the required data from repository.

The class diagram is not completed yet because the Repositories package is needed to interact with the database. Although it is not completed, the design idea is there, the Repositories package contains source code to get the data from the database.
