public class VisitorA  implements Visitor{

    private int ageSum;

    public VisitorA() {
        ageSum = 0;
    }

    @Override
    public void visit(VisitableElement visitableElement) {
        if (visitableElement instanceof VisitableElementA) {
            ageSum += ((VisitableElementA) visitableElement).getAge();
        } else {
            //...
        }
    }

    public int getAgeSum() {
        return ageSum;
    }
}
