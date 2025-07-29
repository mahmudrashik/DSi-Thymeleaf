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
bash
mvn spring-boot:run
Access at: http://localhost:8080

4. Usage
-View all tutorials: Navigate to /tutorials
-Add new tutorial: Click "Add Tutorial" or go to /tutorials/new
-Edit tutorial: Click "Edit" button
-Delete tutorial: Click "Delete" button (with confirmation)
-Search: Use the search box

Screenshots 

![image_alt](https://github.com/mahmudrashik/DSi-Thymeleaf/blob/849afb96843e07909b7696febca037ef2d4b76af/Screenshot%202025-07-29%20214511.png)
![ADD_TUTORIALS Screenshot]([Screenshot 2025-07-29 214511.png](https://github.com/mahmudrashik/DSi-Thymeleaf/blob/849afb96843e07909b7696febca037ef2d4b76af/Screenshot%202025-07-29%20214511.png))
![VIEW_TUTORIALS Screenshot](Screenshot 2025-07-29 214809.png)
![Database Screenshot]([Screenshot 2025-07-29 214833.png](https://github.com/mahmudrashik/DSi-Thymeleaf/blob/Rashik/Screenshot%202025-07-29%20214833.png))


Contributing
Fork the project
Create your feature branch (git checkout -b feature/your-feature)
Commit changes (git commit -m 'Add feature')
Push to branch (git push origin feature/your-feature)
Open Pull Request
