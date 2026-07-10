# Spring REST (Spring Boot 3) — spring-learn

Endpoints:
- `GET /hello` — returns `Hello World!!`
- `GET /country` — India, loaded from `country.xml` Spring config
- `GET /countries` — full country list
- `GET /countries/{code}` — single country, case-insensitive; throws `CountryNotFoundException` (404) if absent
- `POST /authenticate` — returns a **JWT** for `{ "username": "user", "password": "pwd" }`

Secured endpoints require `Authorization: Bearer <token>`. Runs on port **8083**.

## Run
```bash
mvn spring-boot:run
curl http://localhost:8083/hello
TOKEN=$(curl -s -X POST http://localhost:8083/authenticate -H "Content-Type: application/json" -d '{"username":"user","password":"pwd"}' | sed 's/.*"token":"\([^"]*\)".*/\1/')
curl http://localhost:8083/countries -H "Authorization: Bearer $TOKEN"
```
