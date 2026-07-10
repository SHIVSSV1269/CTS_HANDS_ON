package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J Exercise 1: Logging error messages and warning levels.
 * Also demonstrates parameterized logging (Exercise 2).
 */
public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public void run() {
        logger.info("Application started");
        logger.debug("This is a debug message (visible when level=debug)");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        // Parameterized logging - avoids string concatenation cost.
        String user = "SHIVSSV1269";
        int attempts = 3;
        logger.warn("User {} failed login {} times", user, attempts);
    }

    public static void main(String[] args) {
        new LoggingExample().run();
    }
}
