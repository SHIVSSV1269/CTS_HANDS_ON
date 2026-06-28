// PayPalGateway.java - Third-party PayPal API (Adaptee)
// Has its own interface that doesn't match PaymentProcessor
public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("PayPal: Processing payment of $" + amount + " via PayPal account.");
    }

    public void makeRefund(double amount) {
        System.out.println("PayPal: Refunding $" + amount + " to PayPal account.");
    }
}
