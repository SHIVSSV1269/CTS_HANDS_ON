# Java Design Patterns - Hands-On Exercises

A comprehensive collection of 11 Java design pattern implementations covering Creational, Structural, and Behavioral patterns.

## Patterns Covered

| # | Pattern | Category |
|---|---------|----------|
| 1 | [Singleton](#1-singleton-pattern) | Creational |
| 2 | [Factory Method](#2-factory-method-pattern) | Creational |
| 3 | [Builder](#3-builder-pattern) | Creational |
| 4 | [Adapter](#4-adapter-pattern) | Structural |
| 5 | [Decorator](#5-decorator-pattern) | Structural |
| 6 | [Proxy](#6-proxy-pattern) | Structural |
| 7 | [Observer](#7-observer-pattern) | Behavioral |
| 8 | [Strategy](#8-strategy-pattern) | Behavioral |
| 9 | [Command](#9-command-pattern) | Behavioral |
| 10 | [MVC](#10-mvc-pattern) | Architectural |
| 11 | [Dependency Injection](#11-dependency-injection) | Architectural |

## How to Run Each Exercise

Each exercise is self-contained in its own folder. Compile and run with:

```bash
cd Ex1_Singleton/src
javac *.java
java Main
```

---

## 1. Singleton Pattern
**Scenario:** Ensure a `Logger` utility has only one instance throughout the app lifecycle.

## 2. Factory Method Pattern
**Scenario:** Create different document types (Word, PDF, Excel) via a common factory interface.

## 3. Builder Pattern
**Scenario:** Build complex `Computer` objects with optional components step by step.

## 4. Adapter Pattern
**Scenario:** Integrate multiple third-party payment gateways with different interfaces.

## 5. Decorator Pattern
**Scenario:** Dynamically add notification channels (Email, SMS, Slack) at runtime.

## 6. Proxy Pattern
**Scenario:** Lazy-load and cache remote images in an image viewer app.

## 7. Observer Pattern
**Scenario:** Notify multiple clients (Mobile, Web) when stock prices change.

## 8. Strategy Pattern
**Scenario:** Select payment methods (Credit Card, PayPal) at runtime.

## 9. Command Pattern
**Scenario:** Issue on/off commands to home automation devices via a remote control.

## 10. MVC Pattern
**Scenario:** Manage student records with a clean Model-View-Controller separation.

## 11. Dependency Injection
**Scenario:** Inject a `CustomerRepository` into a `CustomerService` via constructor injection.

---

## Prerequisites
- Java 8 or higher
- No external dependencies required
