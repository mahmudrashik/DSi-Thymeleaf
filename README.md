# Thymeleaf Spring Boot CRUD Application

## Project Overview

A simple CRUD (Create, Read, Update, Delete) web application built using Spring Boot, Thymeleaf, and PostgreSQL. It allows users to manage tutorials with full database operations.


## Features

- **Create**: Add new tutorials with title, description, level, and published status
- **Read**: View all tutorials in a paginated table
- **Update**: Modify existing tutorial information
- **Delete**: Remove tutorials with confirmation
- **Search**: Find tutorials by keyword
- **Responsive Design**: Works on all device sizes

## Technology Stack

- **Backend**: 
  - Java 17+
  - Spring Boot 3.x
  - Spring Data JPA
- **Frontend**:
  - Thymeleaf
  - Bootstrap 5
- **Database**: PostgreSQL
- **Build Tool**: Maven

## Installation

### Prerequisites

- Java 17 or later
- Maven 3.6+
- PostgreSQL 12+

### Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/thymeleaf-springboot-crud.git
   cd thymeleaf-springboot-crud
   
2. Database setup:
- Create a PostgreSQL database named demo

-Update connection details in src/main/resources/application.properties:

properties
spring.datasource.url=jdbc:postgresql://localhost:5432/demo

spring.datasource.username=your-username

spring.datasource.password=your-password

spring.jpa.hibernate.ddl-auto=update

3. Build and run:
   
 ```bash
 mvn spring-boot:run




