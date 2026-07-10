# Difference between JPA, Hibernate and Spring Data JPA

**JPA (Java Persistence API)**
- JPA is a *specification* (JSR 338). It defines a standard set of interfaces
  and annotations (`@Entity`, `@Table`, `@Id`, `@Column`, `EntityManager`, JPQL)
  for object-relational mapping in Java.
- JPA has **no implementation of its own** — it only describes *how* ORM should
  behave, not the actual code.

**Hibernate**
- Hibernate is the most popular **implementation** (a provider) of the JPA
  specification. It is a full ORM framework.
- It also offers extra features beyond the JPA standard (HQL, caching,
  `Session`, `SessionFactory`, etc.).
- Core objects: `SessionFactory`, `Session`, `Transaction`, `TransactionFactory`,
  `ConnectionProvider`.

**Spring Data JPA**
- Spring Data JPA is an **abstraction layer built on top of JPA/Hibernate**.
- It removes boilerplate: instead of writing an `EntityManager`-based DAO, you
  declare an interface extending `JpaRepository<Entity, ID>` and Spring generates
  the implementation at runtime.
- It provides ready-made CRUD methods (`save`, `findById`, `findAll`,
  `deleteById`) and *derived query methods* (e.g. `findByName(...)`).

**Relationship (top → bottom of abstraction):**

```
Spring Data JPA   (abstraction: repositories, query methods — least boilerplate)
        │  uses
       JPA         (specification: @Entity, EntityManager, JPQL)
        │  implemented by
    Hibernate      (ORM engine that actually talks to the database)
        │
     JDBC / DB
```

**Benefit of ORM:** it lets you work with Java objects instead of raw SQL,
abstracts the specific database, manages transactions, and reduces boilerplate
data-access code.
