public class ON implements State{

    private static ON on = new ON();

    public ON() {
    }

    public static ON getInstance() {
        return on;
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light OFF");
        light.setState(OFF.getInstance());
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("No change");
    }
}
