package com.example.factory;

/**
 * Creator: declares the factory method createDocument().
 * Subclasses decide which concrete Document to instantiate.
 */
public abstract class DocumentFactory {
    /** Factory method - implemented by each concrete factory. */
    public abstract Document createDocument();

    /** Convenience template method that uses the product. */
    public Document newDocument() {
        Document doc = createDocument();
        System.out.println("Factory produced a " + doc.getType() + " document.");
        return doc;
    }
}
