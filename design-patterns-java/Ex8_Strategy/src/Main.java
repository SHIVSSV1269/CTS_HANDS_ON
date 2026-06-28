public class Main {
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern Demo ===\n");

        // Pay with Credit Card
        PaymentContext context = new PaymentContext(
                new CreditCardPayment("4111111111111234", "Ravi Kumar"));
        System.out.println("-- Checkout with Credit Card --");
        context.executePayment(299.99);

        // Switch strategy to PayPal at runtime
        System.out.println("\n-- Switch to PayPal at runtime --");
        context.setStrategy(new PayPalPayment("ravi@example.com"));
        context.executePayment(149.50);

        // Another order with a different card
        System.out.println("\n-- New order with different Credit Card --");
        context.setStrategy(new CreditCardPayment("5500005555555559", "Priya Sharma"));
        context.executePayment(89.00);
    }
}
