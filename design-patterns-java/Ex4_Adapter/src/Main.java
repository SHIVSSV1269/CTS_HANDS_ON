public class Main {
    public static void main(String[] args) {
        System.out.println("=== Adapter Pattern Demo ===\n");

        // Use PayPal through a unified interface
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        System.out.println("-- PayPal Gateway --");
        paypal.processPayment(150.00);
        paypal.refundPayment(50.00);

        // Use Stripe through a unified interface
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        System.out.println("\n-- Stripe Gateway --");
        stripe.processPayment(200.00);
        stripe.refundPayment(25.00);

        System.out.println("\n-- Client code uses the same interface for all gateways --");
    }
}
