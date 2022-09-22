/*
    요구 사항
    - 커피 제조기
    - 아메리카노, 라뗴
    - 물, 우유 데코레이터
 */

public class Main {
    public static void main(String[] args) {
        Component espresso = new Base();
        System.out.println("에스프레스: " + espresso.add());

        Component americano = new WaterDecorater(new Base());
        System.out.println("아메리카노: " + americano.add());

        Component latte = new MilkDecorater(new WaterDecorater(new Base()));
        System.out.println("라떼: " + latte.add());
    }
}