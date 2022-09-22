public class LightTurnOffCommand implements Command{
    private final LightReceiver lightReceiver;

    public LightTurnOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOff();
    }
}
