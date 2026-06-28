// RealImage.java - Real Subject (expensive to create)
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        // Simulates an expensive network operation
        System.out.println("RealImage: Loading '" + filename + "' from remote server...");
        try { Thread.sleep(500); } catch (InterruptedException e) { /* ignore */ }
        System.out.println("RealImage: '" + filename + "' loaded successfully.");
    }

    @Override
    public void display() {
        System.out.println("RealImage: Displaying '" + filename + "'");
    }
}
