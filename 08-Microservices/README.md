# Microservices with Spring Boot 3

Two independent Spring Boot services:

- **account-service** (port 8080) — `GET /accounts/{number}`
- **loan-service** (port 8081) — `GET /loans/{number}`

Each has Spring Boot Actuator enabled for health/metrics. This is the base for
adding a Eureka discovery server and an API gateway (next exercises in the track).

## Run (in two terminals)
```bash
cd account-service && mvn spring-boot:run
cd loan-service    && mvn spring-boot:run
```
