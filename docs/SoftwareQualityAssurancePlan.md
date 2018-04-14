=====================================================================

## Software Quality Assurance Plan

=====================================================================

##### Team: Shortgun Surgery

##### Version 1

##### Team Members:

- Adrian Bin

- Ian Kabil Felix

- Penquin Dee

- Lim Janzen

- Mubtasim Mahmud

- Zayan Ikram

----------------------------------------------------------

## Revision List

| Version | Date     | Author     | Comments    |
| ------- | -------- | ---------- | ----------- |
| 0.1     | 9/4/2018 | Adrian Bin | First Draft |
|         |          |            |             |
|         |          |            |             |

-------------------------------------------

#### Table of Contents

- [Introduction](#intro)
    - [Purpose](#intro-purpose)
    - [Scope](#intro-scope)
    - [Methodology](#intro-method)
- [Quality Assurance Strategy](#qa-strategy)
- [Documentation](#doc)
- [Objectives](#objectives)
- [Reviews and Audits](#review)
- [Tools and Techniques](#tools)
- [Testing Strategies](#test)
- [Organization](#org)
- [Glossary](#glossary)
- [Appendix](#appendix)

<a name="intro"></a>
#### 1. Introduction

<a name="intro-purpose"></a>
###### 1.1 Purpose

​	The purpose of Software Quality Assurance Plan is to define the technique, processes and methodology used for the entire software development process in order to ensure the software and other project artefacts meet its requirement and standard for project, development team, client and other stakeholders.


<a name="intro-scope"></a>
###### 1.2 Scope

​	The Scope of this document encompasses the entire software development process, includes artefacts, choice of software and language, teams and team member.

​	The main stakeholders of this document are the development teams. All team members are responsible to ensure all the artefacts and the development process meets the requirements of this document.


<a name="intro-method"></a>
###### 1.3 Methodology

​	This document is created based on ‘International Organization for Standards’(ISO), Software Engineering Institute's(SEI) Capability Maturity Model (CMM) and the Institute for Electrical and Electronics Engineers (IEEE) standards to ensure a high-quality Software Quality Assurance Plan Document.

----------------------------------------------

#### 2. Quality Assurance Strategy



----------------------------------------------

#### 3. Documentation

-------------------------------------

#### 4. Goals

---------------------------------------------



#### 5. Reviews And Audits

--------------------------------------------------------
Formal and informal reviews will be conducted on all deliverables. The general strategy for the review is given below:

##### Formal Inspections
###### Fagan Inspections
- There will be set times during the iteration where Fagan Inspections will be conducted. Whichever team that works on their module will get together and conduct a Fagan Review on their work during these times. They will ensure that the necessary revisions are made before they proceed.

##### Informal Inspections
###### Instantaneous review, pair programming
- During the coding process, there will be instances where two people look at one machine to ensure everything coded in makes sense and is up to quality.

###### Peer Reviews
- Peer reviews will be conducted at convenient times to ensure the quality is up to standard and all action items are addressed.

###### Code Walk-throughs
- Code Walk-throughs will be conducted to ensure that the process is verifiable and all the items have been addressed.

#### 6. Tools and Techniques

----------------------------------------------------
The following tools and techniques will be used to ensure the quality of the functional requirements for the system:

###### Traceability Matrix
- Once the coding process starts after the requirements are documented and reviewed, a requirements traceability matrix will be used to ensure all requirements are addressed. 

###### Peer review
- All artifacts will be reviewed by other team members once submitted. Feedback can be given on each artifact and issues can be discussed during these meetings. This ensures everyone is on the same page on how the system should behave once implemented.

###### Customer review
- After peer review, the documentation is created and then sent to the customer to verify the customer's expectation and then sent back for final review.

###### Regression testing
- Regression testing will be done after all the bugs are fixed after an iteration, to ensure all bugs are fixed correctly and new bugs do not appear.



#### 7. Testing Strategy

-------------------------------------------------------

#####Scope and overview

​	Testing Approach is designed to detect any defects in the system and inconsistency between requirements.

​	The primary audience for the testing strategy is the development team and the client (eSolution). The development team is responsible for performing the test using the test procedure written in this document to ensure the testing process is consistent and maintain a standard quality for the software.

​	Clients are able to review, approve and comment on the testing strategy and also the test case. As our main client(e-solution) have a major concern on the functionality, reliability and security feature on the software, also considering e-solution has a technical background, e-solution may want to supervise our work quality by examine testing strategy and test case. 

​	This scope of this testing strategy is applied to all the executable code, it does not apply to other artefact like requirement document.

​	This testing strategy should apply for the whole development period.

##### Testing Approach & Testing Tools

 	Testing Approach is divided into functional and non-functional. Functional Test case is to test if the piece of code buggy. To test if code fulfill its requirement, we use Non-Functional Test case which include usability, portability, maintainability, reliability and stability (based on ISO9000 standard)

##### Release Control

​	Release management plan with appropriate version history that will make sure test execution for all modification in that release

​	Make sure all the testing is done before the team release the latest version of the software.

##### Review and Approvals

​	All of the documents defined in the testing strategy have to be reviewed by all members from each teams and system admins before each iteration begins or when there is any improvement can be made. As the client mentioned at the beginning, the software must have a standard quality and every test cases must meet the ideal requirement given by the client, therefore in this project, the client is also able to review and make any comments on the testing strategy.

​	Any changes on the testing strategy must be recorded at the start of the testing strategy document. The changes must have an approved date and approver name attached on it for the ease of future reference.

#### 8. Organization

--------------------------------------------------
Since there is no Quality Assurance team as such, each team will be conducting their own quality assurance on their deliverables. Ideally 10% of the workload should be spend on quality assurance and the exact hours spend on it will depend on the size of each iteration
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


#### 9. Glossary

--------------------------------------



#### 10. Appendix
