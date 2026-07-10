package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Mockito Exercise 1: Mocking and Stubbing.
 * Mock the ExternalApi dependency and stub getData() to return a fixed value.
 */
class MockingStubbingTest {

    @Test
    void testFetchDataWithMock() {
        // Arrange: create mock and stub its behavior
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        // Act
        String result = service.fetchData();

        // Assert
        assertEquals("Mock Data", result);
    }
}
