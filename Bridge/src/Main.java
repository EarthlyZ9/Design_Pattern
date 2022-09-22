/*
    요구사항
    - 모스코드를 출력하는 프로그램
    - 모스코드를 출력하는 방식에는 기본 dot/dash 방식, 소리를 이용하는 방식, 빛을 이용하는 방식 등이 있음
 */

public class Main {
    public static void main(String[] args) {
        PrintMorseCode defaultCode = new PrintMorseCode(new DefaultMorseCodeFunction());
        defaultCode.j().i().s().o().o();

        PrintMorseCode soundCode = new PrintMorseCode(new SoundMorseCodeFunction());
        soundCode.j().i().s().o().o();

        PrintMorseCode flashCode = new PrintMorseCode(new FlashMorseCodeFunction());
        flashCode.j().i().s().o().o();

    }
}