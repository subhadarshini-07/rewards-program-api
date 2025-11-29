Rewards Program Web API
============================
This project implements a RESTful Web API to calculate reward points for customers based on their transactions, as part of a technical assessment.

Requirements 
=====================
The application calculates reward points using the following logic: 
A customer receives 2 points for every dollar spent over \$100 in each transaction. 
Plus 1 point for every dollar spent between \$50 and \$100 in each transaction. 
(e.g., a \$120 purchase = 2×$20+1×$50=902 cross $ 20 plus 1 cross $ 50 equals 902×$20+1×$50=90 points). 

Technologies Used 
==========================
Language: Java 
Framework: Spring Boot 
Version Control: Git / GitHub

Project Structure
===========================
The project is structured as a standard Spring Boot application, including controllers for the API endpoints, services for the business logic (calculating points), and data models/repositories for handling customer and transaction data.

How to Run
============================
Prerequisites
Java Development Kit (JDK) 17 or later
Maven or Gradle (for dependency management and building)
Steps
Clone the repository:
git clone https://github.com/yourusername/your-repository-name.git
cd your-repository-name
Build the project (using Maven):
Code= ./mvnw clean install
Run the application:
Code= ./mvnw spring-boot:run

The API will be available at http://localhost:8080.
API Endpoints
=================================
Calculate Monthly and Total Rewards
Endpoint: GET /rewards/{customerId}
Description: Retrieves the total reward points for a specific customer, broken down by month and total for a three-month period
