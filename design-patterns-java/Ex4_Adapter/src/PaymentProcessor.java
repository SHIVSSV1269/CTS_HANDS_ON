// PaymentProcessor.java - Target interface our system expects
public interface PaymentProcessor {
    void processPayment(double amount);
    void refundPayment(double amount);
}
