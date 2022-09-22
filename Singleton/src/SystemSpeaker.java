/* 요구사항
    시스템의 스피커에 접근하기
 */

public class SystemSpeaker {
    // 하나의 인스턴스 생성을 위해 static 및 private
    static private SystemSpeaker instance;
    private int volume;

    //생성자는 Private, 외부에서 생성하지 못하도록 함
    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            // 시스템 스피커
            instance = new SystemSpeaker();

            // 로그
            System.out.println("인스턴스 새로 생성");
        } else {
            System.out.println("인스턴스 이미 생성");
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
