public class VisitableElementA implements VisitableElement{
    public int age;

    public VisitableElementA(int age) {
        super();
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
