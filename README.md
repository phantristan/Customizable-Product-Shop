# Customizable Product Shop - Spring MVC Application

## Overview

This project is a web application built using Spring MVC with a Java backend. The goal of the project is to simulate a customizable product shop, where the user can manage products and parts. The project showcases the use of the Model-View-Controller (MVC) design pattern, Thymeleaf for dynamic HTML templates, and basic inventory management functionality.

## Features

- **Customizable Shop Theme:** A flexible design that allows customization of the shop's theme and products.
- **Dynamic Product Management:** Add, update, and delete products in the shop's inventory.
- **Parts Management:** Define and manage parts that can be associated with products.
- **Buy Now Feature:** A button to purchase products, which decreases inventory and displays success or failure messages.
- **About Page:** An informational page that describes the shop and its purpose.
- **Responsive Design:** A user-friendly interface styled with CSS.

## Project Details

### Key Technologies Used
- **Spring Boot:** Simplifies application configuration and embedded web server setup.
- **Thymeleaf:** A Java template engine for creating dynamic web pages.
- **Maven:** Dependency management and project build tool.
- **H2 Database:** Embedded database for data storage and retrieval during development.

### Directory Structure
- **Model Layer:** Handles application data and business logic.
    - `src/main/java/com.example.demo.domain`: Entity classes representing products and parts.
    - `src/main/java/com.example.demo.repositories`: Repository interfaces for database operations.
    - `src/main/java/com.example.demo.service`: Services for interaction between controllers and repositories.
    - `src/main/java/com.example.demo.validators`: Custom validation logic for application data.
- **View Layer:** Defines user interface components.
    - `src/main/resources/templates`: Thymeleaf HTML templates.
    - `src/main/resources/static/css`: CSS files for styling.
- **Controller Layer:** Manages user requests and application flow.
    - `src/main/java/com.example.demo.controllers`: Controller classes annotated with `@Controller` for request handling.

### Additional Files
- **`application.properties`**: Configuration settings for the application.
- **`BootStrapData.java`**: Provides sample data for testing and development.
- **`pom.xml`**: Maven Project Object Model configuration file.

## Setup and Usage

### Prerequisites
- Java JDK 8 or higher
- Maven
- IntelliJ IDEA (or any Java IDE)

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   
2. Build the project using Maven:
   ```bash
   mvn clean install

3. Run the application:
    ```bash
   mvn  spring-boot:run
   
4. Open the web browser and navigate to:
   ```bash
   http://localhost:8080
