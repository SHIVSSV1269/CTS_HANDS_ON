// StripeAdapter.java - Adapter that wraps StripeGateway
public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Translates our interface call to Stripe-specific method
        stripeGateway.charge(amount, "USD");
    }

    @Override
    public void refundPayment(double amount) {
        stripeGateway.issueRefund(amount);
    }
}
