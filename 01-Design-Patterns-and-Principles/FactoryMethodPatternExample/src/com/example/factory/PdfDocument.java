package com.example.factory;

/** Concrete product. */
public class PdfDocument implements Document {
    @Override public void open()      { System.out.println("Opening a PDF document (.pdf)"); }
    @Override public String getType() { return "PDF"; }
}
