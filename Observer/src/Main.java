/*
    요구사항
    - 유튜버를 구독하거나 구독 취소 할 수 있음
    - 유튜버가 영상을 올렸을 때 알려줌
 */

public class Main {
    public static void main(String[] args) {
        Youtuber youTuber = new Youtuber();
        Observer subscriberA = new SubscriberA();
        Observer subscriberB = new SubscriberB();

        System.out.println("subscriberA 구독 등록");
        youTuber.registerObserver(subscriberA);
        System.out.println("subscriberB 구독 등록");
        youTuber.registerObserver(subscriberB);

        youTuber.notifyObservers("New Video Uploaded!");
    }
}