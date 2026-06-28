// NotifierDecorator.java - Abstract Decorator
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        // Delegate to the wrapped notifier
        wrappedNotifier.send(message);
    }
}
