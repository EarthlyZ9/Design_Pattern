public class ColleagueC extends Colleague{
    public ColleagueC(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("-> Admin cannot receive message\n");
    }
}
