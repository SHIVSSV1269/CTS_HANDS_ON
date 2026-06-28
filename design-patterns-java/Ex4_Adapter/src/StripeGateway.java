// StripeGateway.java - Third-party Stripe API (Adaptee)
public class StripeGateway {
    public void charge(double amount, String currency) {
        System.out.println("Stripe: Charged " + currency + " " + amount + " via Stripe.");
    }

    public void issueRefund(double amount) {
        System.out.println("Stripe: Issued refund of $" + amount + " via Stripe.");
    }
}
