import java.util.ArrayList;
import java.util.List;

public class Youtuber implements Subject{
    private List<Observer> subscriberList;
    public Youtuber() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        subscriberList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        subscriberList.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (Observer observer : subscriberList) {
            observer.notifySubscriber(msg);
        }
    }
}