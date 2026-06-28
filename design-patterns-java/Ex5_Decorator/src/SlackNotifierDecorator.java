// SlackNotifierDecorator.java - Concrete Decorator
public class SlackNotifierDecorator extends NotifierDecorator {
    private String slackChannel;

    public SlackNotifierDecorator(Notifier notifier, String slackChannel) {
        super(notifier);
        this.slackChannel = slackChannel;
    }

    @Override
    public void send(String message) {
        super.send(message);  // First send via wrapped notifier
        System.out.println("SLACK to [" + slackChannel + "]: " + message);
    }
}
