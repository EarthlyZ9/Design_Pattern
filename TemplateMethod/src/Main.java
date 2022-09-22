/* 요구 사항
    게임의 접속 과정 구현하기 -> requestConnection(String str): String

    고려할 것
    1. 보안과정: doSecurity(String string):String
    2. 인증과정: authentication(String id, String password):boolean
    3. 권한과정: authorization(String userName):int
    4. 접속과정: connection(String info):String

 */

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaltGameConnectHelper();
        helper.requestConnection("암호화된 정보");
    }
}