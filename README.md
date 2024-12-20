# Chat Application - Spring Boot

This is a simple **Chat Application** built using **Java Spring Boot**, designed for real-time messaging. It includes an **H2 in-memory database** for storing user data and messages.

## Features

- **User Management**: Registration and login system.
- **Real-time Chat**: Send messages.
- **H2 Database Console**: Inspect the database directly.
- **Spring Tool Suite Integration**: Easily import and run the project.

---

## Prerequisites

1. **Java**: Ensure you have JDK 17+ installed.
2. **Spring Tool Suite (STS)**: Download and install from [Spring Tool Suite](https://spring.io/tools).
3. **Maven**: Should be configured (bundled with STS).
4. **Web Browser**: For accessing the H2 console and application frontend.

---

## Installation and Setup

### 1. Clone the Repository
```bash
git clone https://github.com/your-repo/chat-application.git
cd chat-application
2. Import into Spring Tool Suite
Open Spring Tool Suite.
Navigate to File -> Import -> spring starter project -> Existing spring Projects.
Select the project directory and click Finish.
3. Configure Application Properties
Open src/main/resources/application.properties and ensure the following configurations are set:

properties
Copy code
# Server settings
server.port=8080

# H2 Database settings
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:chatapp
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Logging
logging.level.org.springframework=INFO
4. Run the Application
Right-click on the project in STS.
Select Run As -> Spring Boot App.
Usage
Access the Chat Application
Open your web browser and navigate to:

arduino
Copy code
http://localhost:8080
Access the H2 Console
The H2 database console can be accessed at:

bash
Copy code
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:chatapp
Username: sa
Password: (leave blank)
Project Structure
bash
Copy code
chat-application/
├── src/main/java/com/example/chat
│   ├── controller        # Controllers for handling web requests
│   ├── model             # Data models (User, Message)
│   ├── repository        # Repositories for database access
│   ├── service           # Business logic
│   └── ChatApplication.java  # Main class
├── src/main/resources
│   ├── static            # Static resources (HTML)
│   ├── templates         # Thymeleaf templates
│   └── application.properties  # Configuration file
├── pom.xml               # Maven dependencies
└── README.md             # Project documentation
Dependencies
The project uses the following main dependencies (defined in pom.xml):

Spring Boot Starter Web: For building the web application.
Spring Boot Starter Data JPA: For database interactions.
H2 Database: In-memory database for development.
Thymeleaf: For rendering views.
Add these dependencies to pom.xml:

xml
Copy code
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>
How It Works
Users can register and log in to the chat application.
Messages are stored in the H2 database and fetched in real-time.
Controllers handle the requests, and the data is processed through Services.
The UI is built using Thymeleaf templates, allowing for a clean and simple interface.
