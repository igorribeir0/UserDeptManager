# UserDept Project

This is a simple project developed using **Spring Boot** with **JPA/Hibernate** integration, implementing basic CRUD operations on `User` and `Department` entities.

## Table of Contents
- [Technologies](#technologies)
- [Features](#features)
- [How to Run](#how-to-run)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [Project Structure](#project-structure)

## Technologies

- **Java 17**
- **Spring Boot 3.0**
- **Spring Data JPA**
- **H2 Database** (or another of your choice)
- **Maven**

## Features

- Basic CRUD operations for Users and Departments
- Use of `JpaRepository` for database management
- RESTful API for easy interaction



## H2 Database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true


## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-repo/UserDept.git
```

## Project Structure
``` src/
├── main/
│   ├── java/com/devsuperior/UserDept
│   │   ├── entities
│   │   │   └── User.java
│   │   ├── repositories
│   │   │   └── UserRepository.java
│   │   ├── controllers
│   │   │   └── UserController.java
│   │   └── services
│   │       └── UserService.java (optional)
│   └── resources/
│       └── application.properties
└── test/
    └── java/com/devsuperior/UserDept
        └── UserDeptApplicationTests.java
```
