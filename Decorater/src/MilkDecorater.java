public class MilkDecorater extends Decorater{
    public MilkDecorater(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String add() {
        return super.add() + " + 우유";
    }
}
