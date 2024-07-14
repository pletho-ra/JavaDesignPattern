package DecoratorDP.Notifier;

public class Client {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();
        Notifier smsNotifier = new SmsNotifier(notifier);
        Notifier emailNotifier = new EmailNotifier(smsNotifier);

        emailNotifier.send("Hello World!");
    }
}
