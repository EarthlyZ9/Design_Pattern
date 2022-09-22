public class OFF implements State{

    private static OFF off = new OFF();

    public OFF() {
    }

    public static OFF getInstance() {
        return off;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light ON");
        light.setState(ON.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("No change");
    }
}
