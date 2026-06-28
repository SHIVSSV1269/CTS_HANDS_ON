// CustomerService.java - Service class with Constructor Injection
public class CustomerService {
    // Depends on the interface, NOT the concrete implementation
    private final CustomerRepository customerRepository;

    // Constructor Injection - dependency is provided externally
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomer(int id) {
        String name = customerRepository.findCustomerById(id);
        if (name != null) {
            System.out.println("Found customer [ID=" + id + "]: " + name);
        } else {
            System.out.println("Customer with ID=" + id + " not found.");
        }
    }

    public void addCustomer(int id, String name) {
        customerRepository.saveCustomer(id, name);
    }
}
