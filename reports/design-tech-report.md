# Technical Report - Design

## Summary

This report is meant to elaborate on the nuances involved in building an application using a service-oriented architecture. It will outline the advantages and disadvantages of such an approach, what is involved in the workflow, how such an architecture functions from both a high-level and low-level point of view, and whether following such an approach truly is the optimal approach to be taken for the Honors Project Management System.

## Introduction

Software Oriented Architecture emphasises on creating services, which are small discrete units of software which provides a specific functionality that can be reused in all applications. 
In this model, developers use different services in conjunction with each other instead of building on an entire software program to create new applications. This allows them to reduce code redundancies over multiple applications.
The alternative to SOA was to create entire applications where code had to be reused poorly as programs got increasingly more complex which lead to wasted effort and money during development. Software Oriented Architecture aimed to get rid of this.

## Overview

- ### Advantages

- Each Service is self contained and independent, leading to certain advantages:
    - Re-usability of Services
        - Since each service is self contained and independent to carry out their own specific functions/tasks, they can be reused on other applications without having to make modifications the service
            itself. Take a real life example, if a cup provides a service to hold water, it can have its designed unmodified to store other beverages as well (milk, soft drinks etc.) [10]
    - Maintainability
        - Upgrading, fixing and modifying services is flexible as there is no worry of affecting interactions between services, leading to lesser complications to even complex environments. [10]
    - Easier debugging and unit testing [10]
    - Reducing costs
        - Since each service is reusable as mentioned above, there is no need for software module to be written if a module that provides a similar service already exists. Saving time and money, hence, increasing productivity and efficiency. [12]
- Portability
    - Each service is "Platform Independent", which means that servies can provide public availabilities to most systems. This also leads to a reduction in complications when integrating services regardless of their platforms.
- SOA is considered as one of the more popular architectures, which means that there are already existing tools that are able to support the "utilisation and integration" of an entire SOA cycle. [12]


- ### Drawbacks
    - SOA requires a stable network connection with decent networking speed for it to be useful [11]
    - Difficult to track activity within SOA
        - The SOA process requires "illogical steps" that may lead to software module containing millions of executables. This makes it very difficult to track SOA activities as it has made it more complicated for the user and the machine to manage the interaction of services. [13]
        - Due to this, the SOA process requires good control, quality and management [11]


- ### Why would we use or not use SOA?
- ##### Situtaions that are suitable for SOA
    - When services are expected to be run and maintained independently [11]
    - When services are expected to be reused, to increase productivity [11]
- ##### Situations that are not suitable for SOA
    - When the software is expected to be simple. [11]
    - When there is no stable connection. [11]
    
    

## Essential Components of an SOA Architecture
- Service module
    - Each of the service module which divided in the business process model. It performs part of the application, it must have clear subsystem boundaries, autonomous and loosely coupled design to allow reuse, add, delete module from the system.[9]
- Adapter
    - Added to application to enable access to service through each interface.[9]
- Enterprise Service Bus
    - A data line connecting between service module, middleware, database and other component in the system to enable communication and service.
- Service Broker
    - A monitoring system ensure each service module has no error.
- Business Process Module
    - A map state all the relationship of each component in the SOA architecture.[9]

## Roles of SOA components
- The Enterprise Service Bus (ESB) is arguably the most important component in a SOA. It connects components of the system together, making sure that data is passed to and from components [15]:

- ESB connects to the applications and systems of the software. This is done possible through adapters, which allows access to their capabilities, also allowing them to communicate with each other. [16]
	
- ESB connects to the SOA Registry. A SOA Registry stores the rules, descriptions and definitions associated with speicific services within an SOA. This means that a SOA Registry plays the role of taking record of components that are ready or available. The SOA Registry also helps programmers and analysts select components and helping them connect them with each other. It helps find the services that are needed. [15]
	
- The service broker is in charge of making the connections between components and making sure that they work properly, sometimes the Enterprise Service Bus can play the role of a service broker as well, so a standalone broker is not always required [15]
	
- The SOA Service Manager plays the role of ochestrating SOA infrastructures [16], it interacts with infrastructure services and relay any performance problems of the system directly to the infrastructure service, and the infrastructure services themselves will receive the message and try to fix the problem. [15]

- The SOA Repository acts similarly as the SOA Registry, but instead of storing rules and definitions, it acts as a database to store the software devolopment related information (such as source code) of a service. [15]



## Service provision technologies

- SOAP: A vendor-agnostic technology used for communication between different application components or services via HTTP using an XML-based messaging format. SOAP message formats typically use WSDL as the XML implementation for describing the interface of a web service. [1]

    A SOAP design must adhere to the following constraints:

    - A formal contract must be established to describe the interface of the web service. This is typically done using WSDL, and will include details such as messages, operations, bindings and the location of the web service. [2]
    - The architecture must address complex non-functional requirements such as transaction management, security, addressing, trust, coordination, etc. [2]
    - The architecture needs to support asynchronous processing and invocation. The infrastructure for such capabilities can be provided by standards such as WSRM and APIs such as JAX-WS. [2]


- REST: An architectural style that specifies constraints to be applied to web services that help improve non-functional requirements such as performance, scalability and modifiability if followed correctly. Data and functionality are considered resources in this architectural style, and are accessed using URIs, which are typically links on the Web. REST services use a stateless communication protocol, typically HTTP. [3]

    The REST architectural style adheres to the following principles:

    - Resource identification using URI: URIs are used to identify each resource needed by the service to function. A REST API would thus have a URI for every entity it makes available to consumers. [3]
    - Uniform interface: All resources allow only a fixed set of operations: PUT, GET, POST and DELETE. These correspond to the CRUD operations used widely in databases. PUT creates a new resource, while DELETE erases it. GET retrieves the current state of a specified resource, and POST overwrites the state of an existing resource. [3]
    - Self-descriptive messages: Resources are decoupled from their representation, and enough metadata is provided that the content can be decoded, whether they be in XML, JSON or any other format. [3]
    - Stateful interactions through hyperlinks: Every interaction with a resource is stateless. So, request messages need to carry the information about state that they need to perform their designated functionality. [3]


## Data Transfer using Web Services

Web services commonly transfer data in one of two formats - XML or JSON. Each has its own set of advantages and drawbacks, both of which have been outlined below.

#### XML
XML is a markup language that has similar syntax to HTML and was designed to be both human and machine readable. [4]

###### Advantages
- XML stores data in a structured format that enables parse routines to function even when extra data is added or existing data is removed, unlike HTML. [4]

###### Drawbacks
- XML contains many characters devoted strictly to formatting, so it can waste considerable space, which can be a significant drawback for mobile devices in particular. [4]
- Parsing XML can be slow as parsers would need to check tags to determine the purpose of the data contained within.

#### JSON
JSON is a text-based data interchange format derived from the Javascript programming language. [4]

###### Advantages
- JSON stores data as key-value pairs, so it takes up a lot less space than XML, as it is more focused on content than formatting. [4]
- JSON is faster as less computation is needed to parse it since it stores data in a minimalist fashion.

###### Drawbacks
- JSON can be hard to read for humans.
- It is not feasible for humans to type out JSON as they could with XML.

## Client-Service Interaction

Most of the interactions between service consumers and service providers are web service conversations. [14] To elaborate, Conversational Web Services can be interpreted as primitive, single request/response type interactions.

These interactions vary from service to service and therefore it is critical to recognize each client interaction properly to ensure the client is able to acquire the service they intended.

A brief description of how it works would be the client sending a request to the server to execute a task, this in itself is a form of a web service conversation. 

The server proceeds to execute the task by calling all necessary interactions, which are all considered as Conversational Web Services between the server and relevant parties it interacts with. After receiving the callback information, the server closes those conversations and resumes it's conversation with the client.

## Stateless Services
Stateless service is a communication method which user’s state will not be recorded by the service itself. In another word, it will not maintain session between requests attempt, user can directly access to any service without having access to other service.
Some service can not be totally stateless as it capability does not satisfy. However it can reduce its statefulness by minimize the state information.[18]


- ### Advantages
    - Easy to manage user request between services. When user try to request another service in the same system, service do not need to send user's session to another service.[18]
    - Reduce server workout. As server do not need to store/ maintain session as well as their expiration period for each user, server could free up more memory/processing time for other process.
    - Security. Stateful service maintain user session with sessions, these session ID often appear in the URL link, this makes stateful service insecure which others could spoof by getting the current session URL. On the flip side, stateless service do not have sessions.

- ### Drawbacks
    - Increases resources and network workload. As user need to identify themselves for each request, an identification, passcode and encryption are required in the request which increase the package size also processing time for decrypting user identification.

Current project supports both statelessness and statefulness. It especially suit for stateless service as user access control is only limited to request, view and register topic and edit gallery. The rest of the service can be access by anyone. Therefore user session will not need to maintain among service. However, it would be a concern for how monash/E-solution like to handle the communication method.



## Choosing the correct service protocol

There are several different points to consider when choosing the correct service protocol while implementing Service Oriented Architecture. It generally depends on the project requirements, technical considerations and business objectives noted below. Since some of the considerations for industrial systems are irrelevant to us they will be omitted:
#### Project requirements
- Timeline of SOA initiative, how long it will potentially take to implement solution

#### Technical considerations
- SOA solution's ability to provide support for all technologies in the IT environment.
- SOA solution's ability to be used with application servers and development tools.
- SOA solution's ability to integrate on-premise and cloud applications.
- SOA solution's ability to match requirements decided on inception (maintenance, efficiency etc.)

#### Business objectives
- Which SOA solution provides best return on investment.
- What new business services do we plan to offer (SaaS or APIs).
- Short-term and long term needs of the project.

## Microservices

Microservices architecture is an architectural style that structures an application as a collection of lowly coupled services. [5] A service is a function that is self-contained and does not have any relation to other services.[6]

Microservices do not share data. Each service has their own database that is not made public to the other services. This is to ensure low coupling between services.

#### Advantages
-	Services can be developed by different teams independently as there is no shared database. 
-	Each team is free to implement/modify anything at anytime without interfering with or being affected by other teams’ progression.
-	Enable continuous delivery/deployment of large, complex applications.[5]
-	Easy to test the functionality of each service.[8]

#### Drawbacks
-	It is much more difficult to integrate all services into the final application since the data of each service is not shared with other services.[8]
-	Difficult to perform integration testing as each service is totally isolated from other services.[8]

Based on the information above and the situation where no one team is confident enough to manage a database that is shared among all team, we should use microservices in our project. Although it will be more complex on sharing data to other databases, it still has more advantages than drawbacks.

Using microservices, each team can handle their own database and can implement relevant functionality for their part without being interrupted by other team's progress.

## Managing dependencies between services

Dependencies between services are managed by sagas. A saga is a sequence/step of local transaction. Each local transaction updates the database of the current service used and sends a signal to trigger the next local transaction in other services to start.[7]

There are two different types of sagas:
- Choreography – each local transaction sends a signal to trigger the next local transaction in other services.[7]
- Orchestration – An object will tell all the related services to a given event what local transactions to execute.[7]

## Recommendations

After thorough research, as presented above, we have decided to go with SOA because the pros outweigh the cons for our project. Looking back, we understand the advantages that only SOA can bring to the table and wish to fully utilise them. The alternatives fell short of the mark. 

Specifically, we have decided to go with the REST service technology instead of the SOAP protocol because our project requires a fast service. The SOAP service has a lot of built-in security measures like WS security as opposed to the REST's performance advantage, but we still opted for this protocol. 

Also, SOA is good for our project because it lets us maintain each project independently of the others and it lets us reuse a service in other applications. The process of debugging is a lot better because individual modules are smaller and easier to detect. Furthermore, if a module fails, the others will still run.

SOA is more reusable and maintaianble as opposed to other architectures. Since our project has 4 different teams working on separate modules, SOA will allows us greater flexibility and cohesion between the teams. We can utilise the element of single use process requests to ensure that we can manage our project without the need for a backend database. 

We fully believe that using this architecture for our project will yield effective and efficient results. SOA is the obvious choice for our project in this matter.

## References

[1] InformIT Article (Introduction to Web Service Technologies). Available: http://www.informit.com/articles/article.aspx?p=336265

[2] Oracle Documentation (Types of Web Services). Available: https://docs.oracle.com/javaee/6/tutorial/doc/giqsx.html

[3] Oracle Documentation (What are RESTful Web Services). Available: https://docs.oracle.com/javaee/6/tutorial/doc/gijqy.html

[4] SegueTech Article (XML vs JSON Based Web Services: Which is the Best Choice?). Available: https://www.seguetech.com/xml-vs-json-based-web-services-which-is-the-best-choice/

[5] Microservices Architecture (What are microservices?). Available: http://microservices.io/

[6] Service Architecture (Service-Oriented Architecture Definition). Available: https://www.service-architecture.com/articles/web-services/service-oriented_architecture_soa_definition.html

[7] Microservices Architecture (Managing data consistency in a microservices architecture using Sagas). Available: http://microservices.io/microservices/general/2018/03/22/microxchg-sagas.html

[8] Microservices Architecture (There is no such thing as a microservice!). Available: http://microservices.io/microservices/news/2018/02/20/no-such-thing-as-a-microservice.html

[9] K. Sahina, *, M. U. Gumusay, "SERVICE ORIENTED ARCHITECTURE (SOA) BASED WEB SERVICES FOR GEOGRAPHIC INFORMATION SYSTEMS"[Online]. Available: http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.431.9824&rep=rep1&type=pdf

[10] Advantages & Disadvantages of Service Oriented Architecture. Available: https://study.com/academy/lesson/advantages-disadvantages-of-service-oriented-architecture.html

[11]Y. Wang and J. Liao, "2009 IITA International Conference on Services Science, Management and Engineering", 2018. [Online]. Available: https://pdfs.semanticscholar.org/2f4f/29efeb4e540462ccb12f51cd00d9e40f97c3.pdf

[12]Service-Oriented Architecture – SOA Features and Benefits. Available: http://www.opengroup.org/soa/source-book/soa/p4.htm#soafabserv

[13]The Disadvantages of SOA – The Art of Service, Standard Requirements Self Assessments. Available: https://theartofservice.com/the-disadvantages-of-soa.html.

[14]Introducing Conversational Web Services. Available: http://www.oracle.com/technetwork/articles/davydov-soa-092581.html

[15]Service Oriented Architecture For Dummies, 2nd Edition, Chapter 7. Available: https://www.safaribooksonline.com/library/view/service-oriented-architecture/9780470376843/12_376843-ch07.xhtml

[16]Service-Oriented Architecture Components - dummies. Available: http://www.dummies.com/software/service-oriented-architecture-components/

[17]Evolution of SOA. Available: https://www.mulesoft.com/ty/wp/soa

[18]Ebiz Article (Evolution of principles of Service Orientation: Service Statelessness). Available: http://www.ebizq.net/blogs/service_oriented/2009/02/evolution_of_principles_of_service_orientation_service_statelessness_part_6.php

## Glossary
- SOA: Software Oriented Architecture

- API: Application Programming Interface. A set of clearly defined methods for communication between different software components.

- JAX-WS: Java API for XML Web Services. A Java programming language API for creating web services, particularly SOAP services.

- SOAP: Simple Object Access Protocol.

- URI: Universal Resource Identifier. String of characters used to identify a resource.

- WSDL: An implementation of XML used as the standard for describing the interface of a web service.

- WSRM: Web Service Reliable Messaging. Describes a protocol for reliably delivering SOAP messages in the instance of software component, system or network failures.
