package com.example.service;

/** Service that depends on ExternalApi. We mock ExternalApi in tests. */
public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    /** Fetches data from the external API and returns it. */
    public String fetchData() {
        return externalApi.getData();
    }

    /** Pushes a payload through the external API. */
    public void pushData(String payload) {
        externalApi.sendData(payload);
    }
}
