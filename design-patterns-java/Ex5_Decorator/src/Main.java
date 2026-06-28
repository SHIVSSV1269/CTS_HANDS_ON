public class Main {
    public static void main(String[] args) {
        System.out.println("=== Decorator Pattern Demo ===\n");

        // Email only
        Notifier emailOnly = new EmailNotifier("user@example.com");
        System.out.println("-- Email Only --");
        emailOnly.send("Server is down!");

        // Email + SMS
        Notifier emailAndSms = new SMSNotifierDecorator(
                new EmailNotifier("user@example.com"), "+91-9876543210");
        System.out.println("\n-- Email + SMS --");
        emailAndSms.send("Disk usage above 90%!");

        // Email + SMS + Slack (stacked decorators)
        Notifier allChannels = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier("user@example.com"), "+91-9876543210"),
                "#alerts");
        System.out.println("\n-- Email + SMS + Slack --");
        allChannels.send("CRITICAL: Payment service is unresponsive!");
    }
}
