## Project Description

The `spring-boot-auth` is an API for user authentication developed in Java with Spring Boot. It allows user registration, login, and token management, including JWT token generation and validation.

## Prerequisites

Before running the project, make sure you have the following items installed on your machine:

- Java JDK 11
- Docker and Docker Compose (optional, only for container execution)

## Database Configuration

The `spring-boot-auth-micro` uses the MySQL database to store user and role information. Before running the application, you need to configure the database.

### Option 1: Run MySQL with Docker (recommended)

If you have Docker and Docker Compose installed, you can use the provided `docker-compose.yml` file to set up and run the MySQL database. Simply run the following command in the project's root directory:

```bash
docker-compose up -d
```

This will create a Docker container containing the MySQL database and run it in the background.

### Option 2: Manual MySQL Configuration

If you prefer to configure MySQL manually, you can do so through MySQL Workbench or another MySQL client. Create a database named `authdb` and configure the username and password as specified in the environment variables in the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/authdb?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=admin123
```

## Project Compilation and Execution

To compile and run the project, you can use Apache Maven. Simply run the following command in the project's root directory:

```bash
mvn spring-boot:run
```

This will compile the project and start the application, which will be available at [http://localhost:8080](http://localhost:8080).

## API Endpoints

### User Authentication

- `POST /api/auth/register`: Register a new user.
- `POST /api/auth/login`: Authenticate a user and return a JWT token.
- `POST /api/auth/refresh-token`: Refresh an expired JWT token.

### User Management

- `GET /api/users`: List all registered users.
- `GET /api/users/{id}`: Retrieve details of a specific user based on the ID.
- `PUT /api/users/{id}`: Update data of an existing user based on the ID.
- `DELETE /api/users/{id}`: Delete a user from the system based on the ID.

### Role Management

- `POST /api/roles`: Create a new role in the system.
- `GET /api/roles`: List all registered roles.
- `GET /api/roles/{id}`: Retrieve details of a specific role based on the ID.
- `PUT /api/roles/{id}`: Update data of an existing role based on the ID.
- `DELETE /api/roles/{id}`: Delete a role from the system based on the ID.

## Dockerizing the Application

If you prefer to run the application in a Docker container, a `Dockerfile` is already configured in the project's root directory. To create a Docker image of the application, run the following command:

```bash
docker build -t spring-boot-auth-micro .
```

Then, you can run the application in a Docker container with the following command:

```bash
docker run -p 8080:8080 spring-boot-auth-micro
```

This will start the application in the container and make it available at [http://localhost:8080](http://localhost:8080).

## Tests

Unit tests were successfully executed using JUnit and Mockito.

### Running the Tests

Make sure you have all dependencies installed and configured correctly. Then, run the unit tests with the following command:

```bash
./mvnw test
```

## Pending Tasks

- [x] Create a base project with Spring Initializr
- [ ] Configure the project with the necessary dependencies
- [ ] Implement entity layer (User, Role)
- [ ] Implement the relationship between User and Role
- [ ] Implement unit tests in AuthController
- [ ] Implement unit tests in UserController
- [ ] Implement unit tests in RoleController
- [ ] Create controller, service, and repository layers
- [ ] Integrate JWT authentication service
- [ ] Implement authorization filters to protect endpoints
- [ ] Implement error and exception handling
- [ ] Complete documentation in README.md
- [ ] Dockerize the application with Dockerfile and Docker Compose

---

