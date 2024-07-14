package DecoratorDP.Notifier;

public class NotifierDecorator implements Notifier{
    protected Notifier wrapper;
    public NotifierDecorator(Notifier notifier){
        this.wrapper = notifier;
    }
    @Override
    public void send(String message) {
        wrapper.send(message);
    }
}
