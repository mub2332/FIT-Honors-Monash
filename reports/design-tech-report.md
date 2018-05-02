# Technical Report - Design

## Summary

This report is meant to elaborate on the nuances involved in building an application using a service-oriented architecture. It will outline the advantages and disadvantages of such an approach, what is involved in the workflow, how such an architecture functions from both a high-level and low-level point of view, and whether following such an approach truly is the optimal approach to be taken for the Honors Project Management System.

## Introduction

## Overview

- ### Advantages

- ### Drawbacks

## Components of an SOA Architecture

## Roles of SOA components

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

## Stateless Services

- ### Advantages

- ### Drawbacks

## Choosing the correct service protocol

## Microservices

Microservices architecture is an architectural style that structures an application as a collection of lowly coupled services. [5] A service is a function that is self-contained and does not have any relation to other services.[6]

Microservices do not share data. Each service has their own database that is not made public to the other services. This is to ensure low coupling between services.

Dependencies between services are managed by sagas. A saga is a sequence/step of local transaction. Each local transaction updates the database of the current service used and sends a signal to trigger the next local transaction in other services to start.[7]

There are two different types of sagas:
- Choreography – each local transaction sends a signal to trigger the next local transaction in other services.[7]
- Orchestration – An object will tell all the related services to a given event what local transactions to execute.[7]

#### Advantages
-	Services can be developed by different teams independently as there is no shared database. 
-	Each team is free to implement/modify anything at anytime without interfering with or being affected by other teams’ progression.
-	Enable continuous delivery/deployment of large, complex applications.[5]
-	Easy to test the functionality of each service.[8]

#### Drawbacks
-	It is much more difficult to integrate all services into the final application since the data of each service is not shared with other services.[8]
-	Difficult to perform integration testing as each service is totally isolated from other services.[8]

## Managing dependencies between services

## Recommendations

## References

[1] InformIT Article (Introduction to Web Service Technologies). Available: http://www.informit.com/articles/article.aspx?p=336265

[2] Oracle Documentation (Types of Web Services). Available: https://docs.oracle.com/javaee/6/tutorial/doc/giqsx.html

[3] Oracle Documentation (What are RESTful Web Services). Available: https://docs.oracle.com/javaee/6/tutorial/doc/gijqy.html

[4] SegueTech Article (XML vs JSON Based Web Services: Which is the Best Choice?). Available: https://www.seguetech.com/xml-vs-json-based-web-services-which-is-the-best-choice/

[5] Microservices Architecture (What are microservices?). Available: http://microservices.io/

[6] Service Architecture (Service-Oriented Architecture Definition). Available: https://www.service-architecture.com/articles/web-services/service-oriented_architecture_soa_definition.html

[7] Microservices Architecture (Managing data consistency in a microservices architecture using Sagas). Available: http://microservices.io/microservices/general/2018/03/22/microxchg-sagas.html

[8] Microservices Architecture (There is no such thing as a microservice!). Available: http://microservices.io/microservices/news/2018/02/20/no-such-thing-as-a-microservice.html

## Glossary

- API: Application Programming Interface. A set of clearly defined methods for communication between different software components.

- JAX-WS: Java API for XML Web Services. A Java programming language API for creating web services, particularly SOAP services.

- SOAP: Simple Object Access Protocol.

- URI: Universal Resource Identifier. String of characters used to identify a resource.

- WSDL: An implementation of XML used as the standard for describing the interface of a web service.

- WSRM: Web Service Reliable Messaging. Describes a protocol for reliably delivering SOAP messages in the instance of software component, system or network failures.
