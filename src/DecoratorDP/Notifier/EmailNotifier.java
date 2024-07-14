package DecoratorDP.Notifier;

public class EmailNotifier extends NotifierDecorator{
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message){
        super.send(message);
        sendEmail(message);
    }

    public void sendEmail(String message){
        System.out.println("Sending Email: " + message);
    }
}
