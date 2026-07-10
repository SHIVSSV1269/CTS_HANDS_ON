package com.example.service;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise 4: Arrange-Act-Assert (AAA) pattern with test fixtures,
 * setup (@BeforeEach) and teardown (@AfterEach) methods.
 */
class CalculatorAAATest {

    private Calculator calculator;  // test fixture

    @BeforeAll
    static void initAll() { System.out.println("@BeforeAll - run once before all tests"); }

    @BeforeEach
    void setUp() {
        // Setup: runs before EACH test
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        // Teardown: runs after EACH test
        calculator = null;
    }

    @AfterAll
    static void tearDownAll() { System.out.println("@AfterAll - run once after all tests"); }

    @Test
    void testAdd() {
        // Arrange
        int a = 7, b = 5;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(12, result);
    }

    @Test
    void testDivide() {
        // Arrange
        int a = 20, b = 4;
        // Act
        int result = calculator.divide(a, b);
        // Assert
        assertEquals(5, result);
    }
}
