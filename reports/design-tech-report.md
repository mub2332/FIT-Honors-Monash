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

## Client-Service Interaction

## Stateless Services

- ### Advantages

- ### Drawbacks

## Choosing the correct service protocol

## Microservices

- ### Advantages

- ### Drawbacks

## Managing dependencies between services

## Recommendations

## References

[1] InformIT Article (Introduction to Web Service Technologies). Available: http://www.informit.com/articles/article.aspx?p=336265

[2] Oracle Documentation (Types of Web Services). Available: https://docs.oracle.com/javaee/6/tutorial/doc/giqsx.html

[3] Oracle Documentation (What are RESTful Web Services). Available: https://docs.oracle.com/javaee/6/tutorial/doc/gijqy.html

## Glossary

- API: Application Programming Interface. A set of clearly defined methods for communication between different software components.

- JAX-WS: Java API for XML Web Services. A Java programming language API for creating web services, particularly SOAP services.

- SOAP: Simple Object Access Protocol.

- URI: Universal Resource Identifier. String of characters used to identify a resource.

- WSDL: An implementation of XML used as the standard for describing the interface of a web service.

- WSRM: Web Service Reliable Messaging. Describes a protocol for reliably delivering SOAP messages in the instance of software component, system or network failures.
