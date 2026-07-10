package com.example.factory;

/** Concrete product. */
public class WordDocument implements Document {
    @Override public void open()      { System.out.println("Opening a Word document (.docx)"); }
    @Override public String getType() { return "Word"; }
}
