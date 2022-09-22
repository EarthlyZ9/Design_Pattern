public class LightTurnOnCommand implements Command{
    private final LightReceiver lightReceiver;

    public LightTurnOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOn();
    }
}
