package com.example.service;

/** External dependency that MyService relies on. In real life this would call a remote API. */
public interface ExternalApi {
    String getData();
    void sendData(String payload);
}
