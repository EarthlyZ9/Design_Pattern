public class SubscriberA implements Observer{
    @Override
    public void notifySubscriber(String msg) {
        System.out.println("to " + this.getClass() + " : " + msg);
    }
}
