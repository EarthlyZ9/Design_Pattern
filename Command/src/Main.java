/*
    요구사항
    - 리모컨으로 불을 켜고 끄는 기능
 */

public class Main {
    public static void main(String[] args) {
        // 리모컨: 명령을 invoke 하는 컨트롤러 인스턴스 생성
        ControllerInvoker controllerInvoker = new ControllerInvoker();

        // 실제로 명령을 받아 처리하는 인스턴스 생성
        LightReceiver lightReceiver = new LightReceiver();

        // 불을 켜라는 명령을 받았을 때 구체적으로 무엇을 해야 하는지 정의 + 명령을 받는 대상 등록
        LightTurnOnCommand turnOnCommand = new LightTurnOnCommand(lightReceiver);

        // 불을 끄라는 명령을 받았을 때 구체적으로 무엇을 해야 하는지 정의 + 명령을 받는 대상 등록
        LightTurnOffCommand turnOffCommand = new LightTurnOffCommand(lightReceiver);

        // 정의해준 구체적인 명령을 컨트롤러에 등록
        controllerInvoker.setCommand(turnOnCommand, turnOffCommand);

        // 컨트롤러를 이용하여 turnOn 명령을 내림
        controllerInvoker.turnOn();

        // 컨트롤러를 이용하여 turnOff 명령을 내림
        controllerInvoker.turnOff();
    }
}