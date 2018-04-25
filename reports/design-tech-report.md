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

## Glossary

- SOAP: Simple Object Access Protocol.

- WSDL: An implementation of XML used as the standard for describing the interface of a web service.
