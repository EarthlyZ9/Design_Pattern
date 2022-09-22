/*
    요구사항
    그림 그리기 툴 개발하기
    - 원 복사 붙여넣기
    - 붙여넣을 때 겹치지 않게 살짝 옆으로 이동시켜주기
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1, 1, 3);
        Circle circle2 = circle1.copy();

        System.out.println(circle1.getX() + ", " + circle1.getY() + ", " + circle1.getR());
        System.out.println(circle2.getX() + ", " + circle2.getY() + ", " + circle2.getR());
    }
}