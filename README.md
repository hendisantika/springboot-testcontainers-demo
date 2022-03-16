# springboot-testcontainers-demo

### Tools and technologies used

1. Java 11+
2. Spring Boot
3. Spring Data JPA
4. MySQL
5. Lombok
6. JUnit 5 Framework
7. IntelliJ IDEA
8. Testcontainers
9. Docker
10. Maven
11.

### What is Integration Testing

As the name suggests, integration tests focus on integrating different layers of the application. That also means no
mocking is involved.

Basically, we write integration tests for testing a feature that may involve interaction with multiple components.

Examples: Integration testing of complete Employee Management Feature ( EmployeeRepository, EmployeeService,
EmployeeController).

Integration testing of complete User Management Feature (UserController, UserService, and UserRepository).

Integration testing of complete Login Feature (LoginRespository, LoginController, Login Service), etc

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/springboot-testcontainers-demo.git`
2. Navigate to the folder: `cd springboot-testcontainers-demo`
3. Run the integration test: `mvn clean test`
