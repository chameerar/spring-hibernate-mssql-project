# Spring Boot Project with Hibernate and MSSQL Database

This repository contains a sample Spring Boot project that demonstrates how to integrate Hibernate with a Microsoft SQL Server (MSSQL) database for building robust web applications.

## Introduction

In today's fast-paced world of web development, creating robust and efficient applications is paramount. This project showcases the powerful combination of Spring Boot, Hibernate, and MSSQL to provide a solid foundation for building modern web applications. With this template, you can quickly set up a development environment and start creating your own applications.

## Prerequisites

Before getting started, ensure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- Integrated Development Environment (IDE) like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/)
- Microsoft SQL Server (MSSQL) installed or accessible database connection details

## Getting Started

To use this project as a template, follow these steps:

1. Clone this repository to your local machine:
2. Open the project in your preferred IDE. 
3. Configure your MSSQL database connection in the application.properties file located in the src/main/resources directory. 
4. Build and run the application

## Configuration
Before running the application, configure the database connection in the application.properties file:
```properties
spring.datasource.url=jdbc:sqlserver://;serverName=localhost;databaseName=booksdb;encrypt=true;trustServerCertificate=true;
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.datasource.username=SA
spring.datasource.password=yourStrong(!)Password
spring.jpa.hibernate.dialect=org.hibernate.dialect.SQLServerDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```
Make sure to replace yourStrong(!)Password with your database password.

## Running the Application
To run the application, you can use your IDE's built-in tools or use the following command:
```bash
mvn spring-boot:run
```
## Testing
You can test the API endpoints using tools like [Postman](https://www.postman.com/).
