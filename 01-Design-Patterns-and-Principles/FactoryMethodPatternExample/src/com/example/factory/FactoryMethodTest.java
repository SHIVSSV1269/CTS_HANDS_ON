package com.example.factory;

/**
 * Test class demonstrating creation of different document types using the
 * Factory Method Pattern. The client code depends only on the abstract
 * DocumentFactory / Document types, not on concrete classes.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        DocumentFactory[] factories = {
            new WordDocumentFactory(),
            new PdfDocumentFactory(),
            new ExcelDocumentFactory()
        };

        for (DocumentFactory factory : factories) {
            Document doc = factory.newDocument();
            doc.open();
            System.out.println("---");
        }
    }
}
