package com.example.factory;

/** Concrete product. */
public class ExcelDocument implements Document {
    @Override public void open()      { System.out.println("Opening an Excel document (.xlsx)"); }
    @Override public String getType() { return "Excel"; }
}
