package com.example.factory;

/** Product interface: common type for all document kinds. */
public interface Document {
    void open();
    String getType();
}
