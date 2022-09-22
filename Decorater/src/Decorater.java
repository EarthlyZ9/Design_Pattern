abstract public class Decorater implements Component {
    private Component coffeeComponent;

    public Decorater(Component coffeeComponent) {
        this.coffeeComponent = coffeeComponent;
    }

    public String add() {
        return coffeeComponent.add();
    }
}
