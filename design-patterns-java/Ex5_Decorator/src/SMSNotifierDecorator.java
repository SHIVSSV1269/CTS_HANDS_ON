// SMSNotifierDecorator.java - Concrete Decorator
public class SMSNotifierDecorator extends NotifierDecorator {
    private String phoneNumber;

    public SMSNotifierDecorator(Notifier notifier, String phoneNumber) {
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        super.send(message);  // First send via wrapped notifier
        System.out.println("SMS  to [" + phoneNumber + "]: " + message);
    }
}
