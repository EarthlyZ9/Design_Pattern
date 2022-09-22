public class DefaltGameConnectHelper extends AbstGameConnectHelper{

    @Override
    protected String doSecurity(String encodedString) {
        System.out.println("디코딩...");
        return "디코딩된 " + encodedString;
    }
    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("인증...");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인...");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return "Information for connection...";
    }
}
