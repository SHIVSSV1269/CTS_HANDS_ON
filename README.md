# CTS_HANDS_ON

Solutions to the **mandatory** hands-on exercises for the Cognizant Digital
Nurture — Java Full Stack Engineer (Deep Skilling) track. Each folder is a
self-contained exercise area with its own README and run instructions.

## Contents

| # | Area | What's inside |
|---|------|---------------|
| 01 | Design Patterns & Principles | Singleton, Factory Method (Java) |
| 02 | Data Structures & Algorithms | E-commerce search (linear/binary), recursive financial forecasting |
| 03 | PL/SQL Programming | Control structures, stored procedures (Oracle) |
| 04 | JUnit, Mockito & SLF4J | JUnit 5 setup/assertions/AAA, Mockito mocking & verifying, SLF4J logging |
| 05 | Spring Core & Maven | XML bean config, dependency injection (LibraryManagement) |
| 06 | Spring Data JPA with Hibernate | `Country` entity + `JpaRepository` (orm-learn), JPA/Hibernate/Spring Data JPA notes |
| 07 | Spring REST (Spring Boot 3) | Hello World, Country services, exception handling, **JWT** auth (spring-learn) |
| 08 | Microservices | account-service + loan-service (Spring Boot 3) |
| 09 | React | Vite SPA — components, lifecycle, styling, ES6, JSX, events, conditional rendering, lists & keys |
| 10 | Angular | Standalone-component Student Course Portal |
| 11 | Git | Git-HOL 1–5 command walkthroughs + sample `.gitignore` |

## Mandatory exercises covered

Based on *DN – Java FSE Mandatory hands-on detail*:

- **Design Patterns:** Ex 1 Singleton, Ex 2 Factory Method
- **DSA:** Ex 2 E-commerce Platform Search, Ex 7 Financial Forecasting
- **PL/SQL:** Ex 1 Control Structures, Ex 3 Stored Procedures
- **JUnit:** Ex 1 Setup, Ex 3 Assertions, Ex 4 AAA / fixtures / setup & teardown
- **Mockito:** Ex 1 Mocking & Stubbing, Ex 2 Verifying Interactions
- **SLF4J:** Ex 1 Error messages & warning levels
- **Spring Core:** Ex 1 Basic config, Ex 2 Dependency Injection, Ex 4 Maven project
- **Spring Data JPA:** Quick example, JPA vs Hibernate vs Spring Data JPA
- **Spring REST:** Web project, Hello World, Country services, get-by-code, JWT auth service
- **Microservices:** account & loan services
- **React:** mandatory ReactJS-HOL labs (SPA, components, lifecycle, styling, ES6, JSX, events, conditional rendering, lists)
- **Angular:** Student Course Portal hands-on
- **Git:** Git-HOL 1–5

## Toolchain

- Java 17+ and Maven 3.6+ for the Java/Spring modules
- Oracle DB (SQL*Plus / SQL Developer) for PL/SQL
- Node.js 20+ and npm for React/Angular

## Notes

The pure-Java exercises (01, 02) compile and run with plain `javac`/`java`.
The Maven and Node modules follow standard Spring Boot / Vite / Angular CLI
layouts and build in any standard local environment. `target/`, `node_modules/`,
and other build output are git-ignored — run `mvn`/`npm install` locally.
