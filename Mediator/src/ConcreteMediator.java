import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<Colleague>();
    }

    @Override
    public boolean addColleague(Colleague colleague) {
        if (colleague != null) {
            return colleagues.add(colleague);
        } else {
            throw new RuntimeException("colleague cannot be null");
        }
    }

    @Override
    public void mediate(Colleague colleague) {
        for(Colleague receiverColleague : colleagues) {
            System.out.println("Mediating " + colleague.getName() + " to " + receiverColleague.getName());
            receiverColleague.receive(colleague);
        }
    }
}
