# Microservices - Store App

This application consists of several microservices that build up a small store web application to retrieve information on devices and displaying the information on Java Server Pages.

Isaiah Jenkins
## Technologies

* Java (Server-side language)
* Spring Boot (Microservices)
* Boot -> Spring Web (Web/REST app)
* Boot -> Spring Data JPA (Java Persistence API w/ Hibernate)
* Boot -> Eureka Server (Spring Cloud Discovery)
* Boot -> Eureka Discovery Client (Spring Cloud Discovery)
* Boot -> JDBC API (Database Connectivity)
* Boot -> MySQL Driver (JDBC for MySQL)
* MySQL (Server)
* MySQL Workbench (visual database design tool for MySQL database)
* Jersey (JAX-RS)
* Tomcat Embed Jasper (JSP file parser)
* Tomcat Servlet API 
* Javax Servlet API
* JSP (Java Server Page)
* JSTL (JavaServer Pages Standard Tag Library)
* Maven (Dependency Injection)
* Eclispe (IDE, Java EE version 2020-12)
* IntelliJ (IDE, IDEA CE)

## Download IDEs and MySQL tools

1. [Eclispe (IDE, Java EE version 2020-12)](https://www.eclipse.org/downloads/packages/)
2. [IntelliJ (IDE, IDEA CE)](https://www.jetbrains.com/idea/download/#section=mac)
3. [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
4. [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)

## Set up schema and tables on MySQL Workbench

Note: Make sure to start your MySQL server on your computer.

Schema - Devices

<img width="263" alt="Screen Shot 2021-03-10 at 11 52 51 PM" src="https://user-images.githubusercontent.com/35716724/110753702-bcd85280-81fb-11eb-9fff-0393a5d077c5.png">

Tables - apple, samsung

<img width="577" alt="Screen Shot 2021-03-10 at 11 53 42 PM" src="https://user-images.githubusercontent.com/35716724/110753789-daa5b780-81fb-11eb-87c4-78df76f622f0.png">

<img width="571" alt="Screen Shot 2021-03-10 at 11 54 09 PM" src="https://user-images.githubusercontent.com/35716724/110753833-eabd9700-81fb-11eb-97f1-bb8600d0ff0d.png">

## Overview on the Mircoservice architecture 

1. Store - Web app that retrieves information on the device types from Samsung and Apple microservices to displays them on Java server pages.
2. Eureka server - A discovery server responsible for holding instances of mircoservice clients and providing easier navigation.
3. Samsung - Extracts the list JSON Device objects gathered from samsung persitence.
4. Samnsung2 - Extra copy of Samsung to test client-side load balancing.
5. Apple - Extracts the list JSON Device objects gathered from apple persitence.
6. Apple persitence - Gathers information from MySQL server on apple devices providing a list of JSON Device objects. 
7. Samsung persistence - Gathers information from MySQL server on samsung devices providing a list of JSON Device objects.

### Extract microservices and import into IDEs

1. Import each microservice folder except into a separate Intellij Maven project.
2. Import Store microservice into Eclispe.

### How to run Store 

3. Start Eureka server in IntelliJ.
4. Start Store in Eclispe.
5. Start remaining microservices in IntelliJ.
6. Go to the [Eureka server page](http://localhost:8761). You should have the following 5 applications running below:
<img width="1065" alt="Screen Shot 2021-03-11 at 8 08 03 AM" src="https://user-images.githubusercontent.com/35716724/110817243-f41d2280-8240-11eb-98e8-2958fc83af40.png">

7. Go to the [Store page](http://localhost:8081) and click on either Samsung or Apple.

<img width="403" alt="Screen Shot 2021-03-11 at 8 13 19 AM" src="https://user-images.githubusercontent.com/35716724/110817949-a81ead80-8241-11eb-8c94-e5133751224d.png">
<img width="422" alt="Screen Shot 2021-03-11 at 8 13 48 AM" src="https://user-images.githubusercontent.com/35716724/110818013-bb317d80-8241-11eb-9859-fa792cbf60ba.png">








