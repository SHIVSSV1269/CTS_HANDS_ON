package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise 1: Setting Up JUnit (this test running proves JUnit is configured).
 * Exercise 3: Assertions in JUnit - demonstrates the common assertion methods.
 */
class AssertionsTest {

    @Test
    void testAssertions() {
        assertEquals(5, 2 + 3);          // assert equals
        assertTrue(5 > 3);               // assert true
        assertFalse(5 < 3);              // assert false
        assertNull(null);                // assert null
        assertNotNull(new Object());     // assert not null
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        assertThrows(ArithmeticException.class, () -> new Calculator().divide(1, 0));
    }
}
