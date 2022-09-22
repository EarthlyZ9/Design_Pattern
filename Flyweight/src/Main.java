/*
    요구 사항
    - x, y, radius, color 속성을 가진 원을 여러 개 찍어내는 ShapeFactory 만들기
    - 색상은 Red, Green, Blue, Yellow
 */

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[(int) (Math.random()*4)]);
            circle.setX((int) (Math.random()*100));
            circle.setY((int) (Math.random()*4));
            circle.setRadius((int) (Math.random()*10));
            circle.draw();
        }
    }
}