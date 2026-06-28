public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===\n");

        // ProxyImage is cheap to create - no network call yet
        Image image1 = new ProxyImage("sunset.jpg");
        Image image2 = new ProxyImage("mountains.png");

        System.out.println("-- Images created (no server calls yet) --\n");

        // First call: triggers actual loading
        System.out.println("Displaying image1 (1st time):");
        image1.display();

        System.out.println("\nDisplaying image1 (2nd time - from cache):");
        image1.display();  // Served from cache - no network call

        System.out.println("\nDisplaying image2 (1st time):");
        image2.display();  // Loads from server

        System.out.println("\nDisplaying image2 (2nd time - from cache):");
        image2.display();  // Served from cache
    }
}
