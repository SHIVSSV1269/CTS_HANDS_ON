# JUnit 5, Mockito & SLF4J

A single Maven project (`junit-mockito-slf4j-handson`) covering:

- **JUnit** — Exercise 1 (setup), Exercise 3 (`AssertionsTest`), Exercise 4 (`CalculatorAAATest`: AAA pattern, `@BeforeEach`/`@AfterEach`).
- **Mockito** — Exercise 1 (`MockingStubbingTest`: mock + stub), Exercise 2 (`VerifyInteractionTest`: verify interactions).
- **SLF4J** — Exercise 1 (`LoggingExample`: error/warn levels + parameterized logging), with a `logback.xml` (console + file appenders).

## Run
```bash
mvn test        # runs all JUnit + Mockito tests
mvn exec:java -Dexec.mainClass=com.example.service.LoggingExample   # or run LoggingExample from your IDE
```
