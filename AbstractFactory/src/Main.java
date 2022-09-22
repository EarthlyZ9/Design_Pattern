import abst.BikeFactory;
import abst.Wheel;
import abst.Body;
import alton.AltonFactory;
import samchully.SamFactory;

/*
    요구사항
    - 자전거를 만드는 두 회사: 삼천리, 알톤
    - 부품에는 바퀴와 몸체가 있다고 가정
 */

public class Main {
    public static void main(String[] args) {
        BikeFactory samFactory = new SamFactory();
        Body samBody = samFactory.createBody();
        Wheel samWheel = samFactory.createWheel();

        System.out.println(samBody.getClass());
        System.out.println(samWheel.getClass());

        BikeFactory altonFactory = new AltonFactory();
        Body altonBody = altonFactory.createBody();
        Wheel altonWheel = altonFactory.createWheel();

        System.out.println(altonBody.getClass());
        System.out.println(altonWheel.getClass());

    }
}