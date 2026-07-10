package com.example.singleton;

/**
 * Exercise 1: Singleton Pattern.
 *
 * Logger is a logging utility that must have exactly one instance across the
 * whole application lifecycle. This is achieved by:
 *   - a private static instance held by the class itself
 *   - a private constructor so no other class can call {@code new Logger()}
 *   - a public static accessor {@code getInstance()} that always returns the
 *     single shared instance.
 *
 * This implementation uses the thread-safe "initialization-on-demand holder"
 * idiom, which is lazy (the instance is created only when first needed) and
 * safe without explicit synchronization.
 */
public class Logger {

    // Private constructor prevents instantiation from any other class.
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Holder class is loaded only when getInstance() is first called.
    private static class Holder {
        private static final Logger INSTANCE = new Logger();
    }

    /** Global access point to the single Logger instance. */
    public static Logger getInstance() {
        return Holder.INSTANCE;
    }

    /** Simple logging method. */
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
