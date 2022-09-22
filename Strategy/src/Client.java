public class Client {
    public static void main(String args[]) {
        Moving train = new Train();
        Moving bus = new Bus();

        /* 기존의 기차와 버스의 이동 방식
            - 기차: 선로
            - 버스: 도로
         */

        train.setMovableStrategy(new RailRoadStrategy());
        bus.setMovableStrategy(new RoadStrategy());

        train.move();
        bus.move();

        /*
            선로를 따라 움직이는 버스가 개발됨
         */

        bus.setMovableStrategy(new RailRoadStrategy());
        bus.move();
    }
}
