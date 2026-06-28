// Computer.java - Product class with static nested Builder
public class Computer {
    // Required attributes
    private final String cpu;
    private final String ram;

    // Optional attributes
    private final String storage;
    private final String gpu;
    private final boolean hasWifi;
    private final boolean hasBluetooth;

    // Private constructor - only Builder can create an instance
    private Computer(Builder builder) {
        this.cpu         = builder.cpu;
        this.ram         = builder.ram;
        this.storage     = builder.storage;
        this.gpu         = builder.gpu;
        this.hasWifi     = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
               "  CPU         : " + cpu + "\n" +
               "  RAM         : " + ram + "\n" +
               "  Storage     : " + (storage != null ? storage : "N/A") + "\n" +
               "  GPU         : " + (gpu != null ? gpu : "Integrated") + "\n" +
               "  WiFi        : " + hasWifi + "\n" +
               "  Bluetooth   : " + hasBluetooth;
    }

    // ---- Static nested Builder class ----
    public static class Builder {
        // Required
        private final String cpu;
        private final String ram;

        // Optional - default values
        private String storage     = null;
        private String gpu         = null;
        private boolean hasWifi    = false;
        private boolean hasBluetooth = false;

        // Builder constructor requires mandatory fields
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder wifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Builder bluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Terminal method - builds and returns the Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
