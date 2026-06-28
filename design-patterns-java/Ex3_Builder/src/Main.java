public class Main {
    public static void main(String[] args) {
        System.out.println("=== Builder Pattern Demo ===\n");

        // Basic configuration
        Computer basicPC = new Computer.Builder("Intel i3", "8GB DDR4")
                .storage("256GB SSD")
                .wifi(true)
                .build();
        System.out.println("-- Basic PC --");
        System.out.println(basicPC);

        // Gaming configuration
        Computer gamingPC = new Computer.Builder("Intel i9-13900K", "32GB DDR5")
                .storage("2TB NVMe SSD")
                .gpu("NVIDIA RTX 4090")
                .wifi(true)
                .bluetooth(true)
                .build();
        System.out.println("\n-- Gaming PC --");
        System.out.println(gamingPC);

        // Minimal configuration (only required fields)
        Computer minimalPC = new Computer.Builder("AMD Ryzen 5", "16GB DDR4").build();
        System.out.println("\n-- Minimal PC --");
        System.out.println(minimalPC);
    }
}
