import java.util.HashMap;
import java.util.Map;

// CustomerRepositoryImpl.java - Concrete Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    // In-memory store simulating a database
    private Map<Integer, String> database = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Seed with sample data
        database.put(1, "Ravi Kumar");
        database.put(2, "Priya Sharma");
        database.put(3, "Ananya Singh");
    }

    @Override
    public String findCustomerById(int id) {
        return database.getOrDefault(id, null);
    }

    @Override
    public void saveCustomer(int id, String name) {
        database.put(id, name);
        System.out.println("Saved customer: [" + id + "] " + name);
    }
}
