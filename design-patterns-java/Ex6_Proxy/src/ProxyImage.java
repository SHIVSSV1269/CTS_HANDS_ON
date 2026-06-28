// ProxyImage.java - Proxy with lazy initialization and caching
public class ProxyImage implements Image {
    private String filename;
    private RealImage cachedImage;  // Cache - null until first request

    public ProxyImage(String filename) {
        this.filename = filename;
        // Note: RealImage is NOT created here (lazy initialization)
    }

    @Override
    public void display() {
        // Lazy initialization: create RealImage only on first display()
        if (cachedImage == null) {
            System.out.println("ProxyImage: Cache miss - loading image for first time...");
            cachedImage = new RealImage(filename);
        } else {
            System.out.println("ProxyImage: Cache hit - returning cached image.");
        }
        cachedImage.display();
    }
}
