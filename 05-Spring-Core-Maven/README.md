# Spring Core & Maven — LibraryManagement

- **Exercise 1** — Basic Spring app: beans defined in `applicationContext.xml`, loaded via `ClassPathXmlApplicationContext`.
- **Exercise 2** — Dependency Injection: `BookRepository` wired into `BookService` (setter injection).
- **Exercise 4** — Maven project with Spring Context/AOP/WebMVC dependencies and the compiler plugin.

`BookService` also has a constructor (Exercise 7 style) to show constructor injection.

## Run
```bash
mvn compile
mvn exec:java -Dexec.mainClass=com.library.LibraryManagementApplication
```
