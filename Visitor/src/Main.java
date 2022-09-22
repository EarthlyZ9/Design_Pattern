/*
    요구 사항
    - 방문하는 인스턴스의 나이를 모두 더하게 하라
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<VisitableElement> visitables = new ArrayList<VisitableElement>();

        visitables.add(new VisitableElementA(1));
        visitables.add(new VisitableElementA(2));
        visitables.add(new VisitableElementA(3));
        visitables.add(new VisitableElementA(4));
        visitables.add(new VisitableElementA(5));

        Visitor visitor = new VisitorA();

        for (VisitableElement visitableElement: visitables) {
            visitableElement.accept(visitor);
        }

        System.out.println(((VisitorA) visitor).getAgeSum());
    }
}