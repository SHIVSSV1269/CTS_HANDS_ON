// PayPalAdapter.java - Adapter that wraps PayPalGateway
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Translates our interface call to PayPal-specific method
        payPalGateway.makePayment(amount);
    }

    @Override
    public void refundPayment(double amount) {
        payPalGateway.makeRefund(amount);
    }
}
