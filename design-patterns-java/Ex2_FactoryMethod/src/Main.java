public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern Demo ===\n");

        DocumentFactory wordFactory = new WordDocumentFactory();
        System.out.println("-- Word Document --");
        wordFactory.openDocument();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        System.out.println("\n-- PDF Document --");
        pdfFactory.openDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        System.out.println("\n-- Excel Document --");
        excelFactory.openDocument();
    }
}
