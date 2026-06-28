// Main.java - Test the Singleton Pattern
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in.");

        Logger logger3 = Logger.getInstance();
        logger3.log("Processing request.");

        // Verify all references point to the same instance
        System.out.println("\n--- Singleton Verification ---");
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        System.out.println("logger2 == logger3: " + (logger2 == logger3));
        System.out.println("Total logs recorded: " + logger1.getLogCount());
        System.out.println("All three variables share the SAME instance: " + (logger1 == logger2 && logger2 == logger3));
    }
}
