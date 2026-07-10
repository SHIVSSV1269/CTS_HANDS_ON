# Design Patterns and Principles

- **SingletonPatternExample** — Exercise 1: a `Logger` implemented as a thread-safe Singleton.
- **FactoryMethodPatternExample** — Exercise 2: a document factory (Word/PDF/Excel) using the Factory Method pattern.

## Run
```bash
cd SingletonPatternExample
javac -d out $(find src -name '*.java')
java -cp out com.example.singleton.SingletonPatternTest

cd ../FactoryMethodPatternExample
javac -d out $(find src -name '*.java')
java -cp out com.example.factory.FactoryMethodTest
```
