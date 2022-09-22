// System

public class ColleagueB extends Colleague{
    public ColleagueB(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("-> System cannot receive message\n");
    }
}
