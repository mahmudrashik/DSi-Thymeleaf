Thymeleaf Spring Boot CRUD Application

Project Overview

This is a simple CRUD (Create, Read, Update, Delete) web application built using Spring Boot, Thymeleaf, and PostgreSQL. It allows users to manage tutorials by performing basic operations like adding, editing, viewing, searching, and deleting tutorial entries.

Features

Create: Add new tutorials with title, description, level, and published status.

Read: View tutorials in a neatly organized table.

Update: Edit existing tutorial information.

Delete: Remove tutorials with confirmation prompts.

Search: Quickly find tutorials using keyword search.

Tech Stack

Backend: Java, Spring Boot

Frontend: Thymeleaf, Bootstrap 5

Database: PostgreSQL

Tools: Maven

Installation

Prerequisites

Java 17 or later

Maven

PostgreSQL

Steps

Clone the repository:

git clone https://github.com/your-username/thymeleaf-springboot-crud.git

Navigate to the project directory:

cd thymeleaf-springboot-crud

Configure PostgreSQL:

Create a database named demo.

Update the database credentials in application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/demo
spring.datasource.username=your-username
spring.datasource.password=your-password

Build and run the application:

mvn spring-boot:run

Access the application:

Go to your web browser and open http://localhost:8080.

Usage

View Tutorials: Navigate to /tutorials

Add Tutorial: Navigate to /tutorials/new

Edit or Delete Tutorials: Use respective buttons in tutorials listing page

Screenshots





Contributing

Contributions are welcome! Please create a pull request or open an issue for any suggestions or bug fixes.
