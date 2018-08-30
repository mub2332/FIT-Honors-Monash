=====================================================================

## Software Quality Assurance Plan

=====================================================================

##### Team: Shortgun Surgery

##### Version 1

##### Team Members:

- Adrian Bin

- Ian Kabil Felix

- Li Jei Yong

- Lim Janzen

- Mubtasim Mahmud

- Zayan Ikram



#### Table of Contents

- [1 - Introduction](#intro)
    - [1.1 - Purpose](#intro-purpose)
    - [1.2 - Scope](#intro-scope)
    - [1.3 - Methodology](#intro-method)
- [2 - Quality Assurance Strategy](#qa-strategy)
- [3 - Documentation](#doc)
- [4 - Goals](#goals)
- [5 - Reviews and Audits](#review)
    - [5.1 - Formal Inspections](#review-formal)
    - [5.2 - Informal Inspections](#review-informal)
- [6 - Tools and Techniques](#tools)
- [7 - Testing Strategies](#test)
    - [7.1 - Scope and Overview](#test-1)
    - [7.2 - Testing Approach and Testing Tools](#test-2)
    - [7.3 - Test Environment](#test-3)
    - [7.4 - Release Control](#test-4)
    - [7.5 - Review and Approval](#test-5)
- [8 - Organization](#org)
- [9 - Process Assurance](#process-assurance)
- [10 - Glossary](#glossary)
- [11 - Appendix](#appendix)

---------------------------------------------------------------------

<a name="intro"></a>
#### 1 - Introduction

<a name="intro-purpose"></a>
###### 1.1 - Purpose

​	The purpose of Software Quality Assurance Plan is to define the technique, processes and methodology used for the entire software development process in order to ensure the software and other project artefacts meet its requirement and standard for project, development team, client and other stakeholders.

<a name="intro-scope"></a>
###### 1.2 - Scope

​	The Scope of this document encompasses the entire software development process, includes artefacts, choice of software and language, teams and team member.

​	The main stakeholders of this document are the development teams. All team members are responsible to ensure all the artefacts and the development process meets the requirements of this document.


<a name="intro-method"></a>
###### 1.3 - Methodology

​	This document is created based on ‘International Organization for Standards’(ISO), Software Engineering Institute's(SEI) Capability Maturity Model (CMM) and the Institute for Electrical and Electronics Engineers (IEEE) standards to ensure a high-quality Software Quality Assurance Plan Document.

---------------------------------------------------------------------

<a name="qa-strategy"></a>
#### 2 - Quality Assurance Strategy

To assure the quality of the software, the development team will have reviews conducted and will use requirement traceability matrix to ensure all the requirements are addressed.

At the end of each iteration/phase, a review within the team will be conducted to ensure the outcome is on the right track and to discuss if there is any improvements can be made during the iteration/phase so that the improved strategy can be used in the next iteration/phase.

At the scenario where a risk occurs, the risk mitigation plan for the specific risk will be executed to minimise the impact toward the outcome. This is to assure that the quality of the software will only get effected as least as possible.

---------------------------------------------------------------------

<a name="doc"></a>
#### 3 - Documentation

There are several documentations required to ensure the software meets the ideal requirements:

###### Software Requirements Specification
Software Requirements Specification is used to understand all the requirements that the software must meets. The software must be implemented based on this documentation to ensure the quality and completeness of the software.

###### Project Management Plan
Project Management Plan is used to manage project progress and project organisation. Project progress indicated all the project phases and the objectives of each phases. Project organization showed the details of each members as well as their role in the project.

###### Risk Management Plan
Risk Management Plan is a documentation that document the possible risks that will happen during the entire progression of the project. Each possible risk is documented with an estimate impact which explained how likely the risk will affect the project. Apart from that, each risk will contain at least one mitigation plan, the mitigation plan is used to minimise the chances that a risk will occur and to minimise the impact toward the project when a risk occurs.

###### Work Item List
Work Item List is a list of use cases that are going to be implemented. Each of the use case will have a priority to show the order of which use cases have to be implemented first. There is also size estimate for each use case that show how big and complicated is the use case.

###### Software Design and Architecture
Software Design and Architecture is the design of the project. It contains a conceptual class diagram which show the relations between each objects in the project, a description on each objects and some activity diagrams to show how the objects in the project are connected to each other.

---------------------------------------------------------------------

<a name="goals"></a>
#### 4 - Goals
###### Goals for each phase


Phase | Goals 
--- | ---
Software Requirement Specification | No more than one defect per page
PMP | No more than one defect per page
Code Testing | After Testing Phase there should be 0.5 defect per KLOC
Code Debugging | After Debug Phase, all defect should be solved 

---------------------------------------------------------------------

<a name="review"></a>
#### 5 - Reviews And Audits

Formal and informal reviews will be conducted on all deliverables. The general strategy for the review is given below:

<a name="review-formal"></a>
##### 5.1 - Formal Inspections
###### Team representative Review

- Each team must select a spokesperson to represent the opinion of the team.

- A Team representative review must be held at least once an iteration to understand and monitor each other's work to ensure a clear division of teamwork, equal workload and follow up project process.

  <a name="review-informal"></a>

##### 5.2 - Informal Inspections
###### Team member Reviews

- Team member Review should be conduct every week to set up goals for the week and review the work process of previous week.

- Each team should discuss and set up their own goal for the week according to the iteration plan.

- Team members should divided into small groups contain 2 to 3 members. Work load for each week must be equally divided to small groups.

- During the developing process, members in small group should frequently supervise each other's work in order to maintain the quality of work. 

- For each Team member review meeting, everyone should demonstrate and validate each other's work for the previous week.

  

---------------------------------------------------------------------

<a name="tools"></a>
#### 6 - Tools and Techniques

The following tools and techniques will be used to ensure the quality of the functional requirements for the system:

Use of Git

- Master Branch is used for combining finalized modules. All on working modules should not be pushed on master branch until it is finished.
- All developing modules should process in a new branch instead of master branch.



###### Customer review(E-solution)
- As Monash(E-solution) has a strict requirements its service, a Customer review should be done at the before and end of each milestone to ensure the plan and product of each milestone meets the requirement for e-solution.
- If E-solution required to change a requirement, a team representative review must be conduct to discuss and modify planning. After meeting is done, iteration should not be started before E-solution approve the new Customer review.


###### Regression testing
- Regression testing will be done after all the bugs are fixed after an iteration, to ensure all bugs are fixed correctly and new bugs do not appear.

###### Tools and Technique for assuring the quality attribute

Quality Attribute | Tool/Technique Used | Rationale for using the tools/technique
----------------- | ------------------- | ---------------------------------------
Unit Testing      | Put all the test case into CI Server | After executing test case in CI server automatically, a report will generate for all the test run result and coverage
Defect Tracking   | Excel sheet                          | Record which could calculate the rate of defect found during the test
Usability         | Questionnaire for User(Monash student) | It helps to understand user (student) requirement which consider as a measurement

---------------------------------------------------------------------

<a name="test"></a>
#### 7 - Testing Strategy

<a name="test-1"></a>
##### 7.1 - Scope and Overview

- Testing Approach is designed to detect any defects in the system and inconsistency between requirements.

- The primary audience for the testing strategy is the development team and the client (e-Solution). The development team is responsible for performing the test using the test procedure written in this document to ensure the testing process is consistent and maintain a standard quality for the software.

- Clients are able to review, approve and comment on the testing strategy and also the test case. As our main client(e-solution) have a major concern on the functionality, reliability and security feature on the software, also considering e-solution has a technical background, e-solution may want to supervise our work quality by examine testing strategy and test case. 

- The scope of this testing strategy is applied to all the executable code, it does not apply to other artefact like requirement document.

- This testing strategy should apply for the whole development period.

<a name="test-2"></a>
##### 7.2 - Testing Approach & Testing Tools

- Testing Approach is divided into functional and non-functional. Functional Test case is to test if the piece of code buggy. To test if code fulfill its requirement, we use Non-Functional Test case which include usability, portability, maintainability, reliability and stability (based on ISO9000 standard)

###### Stage of Testing

- Unit Testing
  - Unit Testing target the basic element of code (a small piece of code/ Function). The objective is to isolate the unit and test its correctness.
- Integration Testing
  - Integration Testing examine the correctness of multiple unit combination. 
- Acceptance Testing
  - The objective of Acceptance Testing is to examine if the system meets the requirement specify on Requirement Document to ensure the product delivery quality.
- Regression Testing
  - The objective of Regression Testing is to catch defects occurs while new modification.

###### Process of Testing

- Create Test Case based on standard for Black Box and White Box Testing
- Test with test case in a designed testing environment (Could be on a device or CI server)
- Record defect found and action

###### Strategy
- Black Box Testing

  - Black Box Testing is used to test if the system meets its functionality.
  - Usage
    - Integration Testing
    - Acceptance Testing

    - Method
      - Tester create a set of test case with input and expected output, 
      - then observe if the input result the expected output

  

  

  White Box Testing

  - White Box Testing used to ensure there is no defects in a basic element of code (a function/ piece of code) by testing every statement in the code to perform a high coverage of test.
  - It is important to ensure every single line of the code is tested at the first stage of testing as it will affect the process of testing on higher level.
  - Usage
    - Unit Testing
  - Method
    - Use Function Coverage to create test cases using expected output and mock method 
    - Use Cobertura (Free Java tool) to check if the code coverage exceed 95%, if not, check unreachable code and completeness of test cases.
    - Then Observe if all test cases are passed

  ​


###### Roles and responsibility for team

- Each team members who wrote the code should be responsible for creating test cases for their own code, as code writer has the best understanding for their own code. (Unit Testing)
- Each team should be responsible for their own parts to make sure work from each teammates is compliable together. (Integration Testing)

###### Instruction on creating test case

- Each Test case should be given a test case ID and include:
  - Test Priority
  - Module Name/ Function Name
  - Test Title
  - Description
  - Test Date
  - Pre-condition
  - Expected Result/ Response
  - Person/ Team responsible

###### Approach for defects during Testing (iterative)

- Step 1: If defects is found, record the defect, its result and test case ID which related to in defect document.
- Step 2: Attempt to fix the error.
- Step 3: Retest with the test case ID which found the defect.
- Step 4: If there are still defect found, repeat Step 1.

<a name="test-3"></a>
##### 7.3 - Test Environment

The test team will select suitable setup of software and hardware which will be used in conducting the test.

The requirement and setup for each environment are based on these few points:
- Test data
- Database server
- Operating system
- Browser
- Network

The software must pass all the test cases in each specific environment before releasing. As this software has database, some of the test cases required mock-up data (test data) in order to check the correctness of the executable code.

The test data must back up by the test team everytime the testing occurs. This is to prevent some test cases might alter the test data and therefore causing the database of the test data corrupted. In the case the database of test data is corrupted, the test team must restore the database using the backup test data.


<a name="test-4"></a>
##### 7.4 - Release Control

- To deploy the software, a list of release control activities must be conducted.
- Every version of the software that is planned to be released must be stated clearly on GIT as well as its artifacts.
- Every version of the software must be backed up properly on GIT with version name in case of any future issues that restoration of data is required.
- Before deploying the new version of the software, the software must ensure that all the test cases (including user acceptance testing) for all modification in the release passed without any issues.

<a name="test-5"></a>
##### 7.5 - Review and Approvals

- All of the documents defined in the testing strategy have to be reviewed by all members from each teams and system admins before each iteration begins or when there is any improvement can be made.
- As the client mentioned at the beginning, the software must have a standard quality and every test cases must meet the ideal requirement given by the client, therefore in this project, the client is also able to review and make any comments on the testing strategy.
- Any changes on the testing strategy must be recorded at the start of the testing strategy document. The changes must have an approved date and approver name attached on it for the ease of future reference.

---------------------------------------------------------------------

<a name="org"></a>
#### 8 - Organization

Each team will be conducting their own quality assurance on their deliverables. Ideally 10% of the workload should be spend on quality assurance and the exact hours spend on it will depend on the size of each iteration.

One member from each team are taken to form a Testing team. It will be operate after each iteration to ensure the modules from each team can work together.

There will be meetings held to ensure all members working on the project knows what techniques they will be using and how they'll be using it to conduct quality assurance. They will all also have access to the SQAP for reference. 
The roles and responsibilities of the members will be decided on what they are working on and what their skillsets are to ensure they do QA on what fits them best. They will eventually know:

- Their roles and responsibilities
- Goals of each activity with which they are associated
- Processes that are to be carried out

Since team members will eventually have well defined roles in Quality Assurance there will ideally be a leader to ensure everything is done right

To manage the quality of artifacts, reviews and tests will be conducted on artifacts that go through changes
They will have document that includes:
- The quality assurance process: how a technique should be carried out
- The goal of the process
- The results of the process
- The information about the reviewer conducting the techniques
- Notes about any relevant information about the artifcat

Quality Assurance techniques need to be prioritised depending on importance and relevance.
The teams need to agree on which artifacts need to have which levels of quality assurance on them
Some artifacts will obviously need more thorough quality assurance than others so the techniques to be used will be decided and done by the teams and members responsible for their artifacts

The quality assurance processes will be evaluated based on:
- Defect Find Rate
- Defect Fix Rate
- Types of Errors identified: whether it's critical, major or minor

The defect rate should decrease over time and the fix rate should be higher each build. All of the critical and minor defects need to be gotten rid of each final build.

---------------------------------------------------------------------
<a name="process-assurance"></a>
#### 9 - Process Assurance
These are the process assurance techniques we came up with after our work on the technical report on Process Assurance:
- Responding to work delay
    - We realized delaying individual work slows down the overall whole team progress and we currently do not have any trackable responsibility for handing in work on time. Therefore, next time if a member is unable to complete work before the deadline, a brief reasoning and explanation should be given to the group through Messenger to increase the groups awareness to their responsibility.
- Ask for help immediately
    - We observe that many difficulties faced by individual work were raised at the last moment causing even more problems therefore teammates should ask for help as soon as possible to decrease the possible stacking of problems.
- Meetings held after overall individual parts have been completed
    - We decided to hold reviews for artefacts to ensure that each piece delivered is up to a sufficient standard of quality also understand way to integrate together.
- Voice chat meetings
    - It is hard for everyone to catch up through text messages and it is important for everyone to be part of the discussions when making decisions and understand the reasonings behind them. Therefore important discussions should be held on voice chat meetings to make sure everyone is involved.
- Standup meetings
    - A stand-up meeting should be done twice a week in order to make sure that everyone are on the track of their individual parts, request help for difficulties and provide peer pressure.
- Adapt test-driven development
    - Ensure that functions adhere to the input and output that we intend.
    - Creating test case improves the vision for developer.



---------------------------------------------------------------------
<a name="glossary"></a>
#### 10 - Glossary
Review - A process where a piece of software is presented to all interested parties for comments and approval
Inspection - Examining software visually to find errors and deviations from the specification. Done by peers specialized in inspections
Walk-through - Where a programmer leads the team to piece of software to find a discuss possible problems.
