package DecoratorDP.Notifier;

public class SmsNotifier extends NotifierDecorator{

    public SmsNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message){
        super.send(message);
        sendSMS(message);
    }
    public void sendSMS(String message){
        System.out.println("Sending SMS: " + message);
    }
}
