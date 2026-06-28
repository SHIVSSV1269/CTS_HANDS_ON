// CustomerRepository.java - Repository interface
public interface CustomerRepository {
    String findCustomerById(int id);
    void saveCustomer(int id, String name);
}
