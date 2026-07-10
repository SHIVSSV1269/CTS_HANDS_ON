package com.example.singleton;

/**
 * Test class that verifies only ONE instance of Logger is ever created
 * and that the same instance is shared across the application.
 */
public class SingletonPatternTest {

    public static void main(String[] args) {
        System.out.println("Requesting Logger instance #1...");
        Logger logger1 = Logger.getInstance();

        System.out.println("Requesting Logger instance #2...");
        Logger logger2 = Logger.getInstance();

        logger1.log("First message from logger1");
        logger2.log("Second message from logger2");

        // Both references must point to the exact same object.
        if (logger1 == logger2) {
            System.out.println("SUCCESS: logger1 and logger2 are the SAME instance (Singleton verified).");
        } else {
            System.out.println("FAILURE: Different instances were created.");
        }

        System.out.println("logger1 hashCode = " + System.identityHashCode(logger1));
        System.out.println("logger2 hashCode = " + System.identityHashCode(logger2));
    }
}
