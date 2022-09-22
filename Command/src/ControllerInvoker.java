public class ControllerInvoker {
    Command turnOn;
    Command turnOff;

    public void setCommand(Command turnOn, Command turnOff) { // 각각 turn on 과 turn off 액션에서 어떤 커맨드를 수행할 것인지
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }

    public void turnOn() {
        this.turnOn.execute();
    }

    public void turnOff() {
        this.turnOff.execute();
    }

}
