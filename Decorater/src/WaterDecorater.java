public class WaterDecorater extends Decorater{
    public WaterDecorater(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String add() {
        return super.add() + " + 물";
    }
}
