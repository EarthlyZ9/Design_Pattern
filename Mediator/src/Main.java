/*
    요구사항
    - Admin, System, User 가 있음
    - User 는 메시지를 전송하고 받을 수 있음
    - Admin 과 System 은 메시지를 보낼 수만 있음
 */

public class Main {
    public static void main(String[] args) {
        Mediator mediator1 = new ConcreteMediator();
        Colleague colleague1 = new ColleagueA("User1");
        Colleague colleague2 = new ColleagueA("User2");
        Colleague colleague3 = new ColleagueB("System");
        Colleague colleague4 = new ColleagueC("Admin");

        colleague1.setMediator(mediator1);
        colleague2.setMediator(mediator1);
        colleague3.setMediator(mediator1);
        colleague4.setMediator(mediator1);

        mediator1.addColleague(colleague1);
        mediator1.addColleague(colleague2);
        mediator1.addColleague(colleague3);
        mediator1.addColleague(colleague4);

        colleague1.setMessage("I'm User1");
        colleague1.send();
    }
}