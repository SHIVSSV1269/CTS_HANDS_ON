// DocumentFactory.java - Abstract Factory with factory method
public abstract class DocumentFactory {
    // Factory Method - subclasses decide which Document to create
    public abstract Document createDocument();

    // Template method that uses the factory method
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}
