// User

public class ColleagueA extends Colleague{
    public ColleagueA(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("-> " + this.name + " received " + colleague.getName() + "'s message: " + colleague.getMessage() + "\n");
    }
}
