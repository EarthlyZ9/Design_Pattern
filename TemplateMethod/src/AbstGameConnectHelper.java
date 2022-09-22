public abstract class AbstGameConnectHelper {

    // 하위 구체 클래스가 메소드를 재정의 해야하기 때문에 private 로 하면 안됨

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String encodedString) {

        // 보안 작업 -> 암호화 된 문자열 디코드
        String decodedString = doSecurity(encodedString);

        // 인증 과정 -> 반환된 것을 가지고 아이디, 암호 할당
        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("아이디와 암호 불일치");
        }
        // 인증 과정을 통해 유저네임 받아옴
        String userName = "userName";
        int i = authorization(userName);

        // 권한 과정 ->
        switch (i) {
            case 0: // 매니저
                break;
            case 1: // 유료 회원
                break;
            case 2: // 무료 회원
                break;
            case 3: // 권한없음
                break;
            default: // 기타 예외
                break;
        }


        return  connection(decodedString);
    }

}
