<h1 align="center"> Spring Boot Fundamentals </h1> <br>

## Table of Contents

- [Introduction](#introduction)
- [This&nbsp;respository](#thisrepository)
- [Dependencies](#dependencies)
- [Run&nbsp;Code](#runcode)
- [Platzi&nbsp;Course](#platzicourse)
- [Notes](#notes)

## Introduction

Spring Boot is a project based on the Spring framework. Its main objective is the execution of the application. Spring Boot integrates third-party libraries, which are very easy to add to applications. In addition, it takes care of configuring them, so the developer does not have to worry about doing it.
Something important about SprinBoot is that it has an embedded server, which can be Tomcat (by default), Jetty or Undertow, so it is not necessary to install an additional server.

#### Inversion of control
Something relevant about Spring is that it implements the inversion of control and the dependency injection pattern. Inversion is the principle of transferring control of the objects of a program to a container/user or framework, this is different from a traditional flow in programming.
The framework is in charge of configuring the instance and initializing all the necessary beans and dependencies found at the class and library level. A bean is an object that is instantiated, assembled and managed by a Spring container. Dependency is an object defined as a functionality, which can work in conjunction with other functionalities.
Some of the advantages of the investment are:
- Decoupling when objects have their dependencies
- The implementation of the dependencies is hidden
- It’s easier to do test by component or dependency mock
- Greater application modularity
Dependency injection (DI) is the process by which objects define their dependencies

#### Log
The logs are a tool that allow debugging the program, there are three types: error, info and debug.

#### JPA
JPA is the Java specification for accessingand managing data between objects/classes and a relational database. Hibernate is just an implementation of JPA.


## This&nbsp;repository
This repository contains the project that was developed throughout the Spring Boot Fundamentals, in which the following concepts are exemplified:

- Create dependency
- Dependency Injecyion
- POJO
- Mapping entities
- H2 Databse
- Query Methods
- JPQL
- DTO
- CRUD
- Trasactional

The project that was developed  is a REST API that controls the operations of users. This API gets information from a H2 database. What this API does is:

- Gets the users
- Posts a new user
- Deletes a user
- Updates a user
- Pagination of users


## Dependencies
- Install OpenJDK 11 or later
- Install Intellj or another IDE thats supports OpenJDK 11 or later and contains maven
- Add spring-boot-devtools
- Add spring-boot-starter-web
- Add spring-boot-starter-data-jpa
- Add spring-boot-starter-test


## Run&nbsp;Code
You can only run these projects using Intelli or another IDE what support maven.


## Platzi&nbsp;Course

Check out [Platzi's Spring Boot Fundamentals course](https://platzi.com/clases/spring-boot/).


## Notes

Most commits correspond to sections of the course in which the project code was changed.
