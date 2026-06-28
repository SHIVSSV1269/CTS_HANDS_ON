public class Main {
    public static void main(String[] args) {
        System.out.println("=== Dependency Injection Pattern Demo ===\n");

        // Create the concrete repository (the dependency)
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the dependency into the service via constructor
        CustomerService service = new CustomerService(repository);

        System.out.println("-- Finding existing customers --");
        service.getCustomer(1);
        service.getCustomer(2);
        service.getCustomer(3);

        System.out.println("\n-- Finding non-existent customer --");
        service.getCustomer(99);

        System.out.println("\n-- Adding a new customer --");
        service.addCustomer(4, "Arjun Mehta");
        service.getCustomer(4);

        System.out.println("\n-- DI benefit: easy to swap implementations --");
        System.out.println("(e.g., replace CustomerRepositoryImpl with a MockRepository for testing)");
    }
}
