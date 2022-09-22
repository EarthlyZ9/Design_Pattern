/* 요구 사항
    다음 연산을 수행하는 객체 만들기
    - 두 배의 수 반환 twiceOf -> float
    - 반의 수를 반환 halfOf -> float

    Math class 에서 double 자료형으로 두 연산을 수행하는 함수가 이미 구현되어있음
 */

/* 패턴 설명
    Math -> Adaptee: 이미 개발이 완료되었고 수정하기 곤란함
    Target (Interface) -> Target: 구현하고자 하는 것의 인터페이스
    TargetImpl -> Adapter: Target 인터페이스 구현
 */

public class Main {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(80f));
    }
}