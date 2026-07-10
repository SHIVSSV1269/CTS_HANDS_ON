package com.example.service;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

/**
 * Mockito Exercise 2: Verifying Interactions.
 * Ensure the service actually calls the expected methods (with expected args).
 */
class VerifyInteractionTest {

    @Test
    void testFetchDataCallsGetData() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        // Verify getData() was called exactly once.
        verify(mockApi, times(1)).getData();
    }

    @Test
    void testPushDataCalledWithArgument() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.pushData("hello");

        // Verify sendData was called with the specific argument.
        verify(mockApi).sendData("hello");
        verifyNoMoreInteractions(mockApi);
    }
}
