public class Won1Dispenser extends DispenseChange{

    private DispenseChange chain;

    @Override
    void setNext(DispenseChange nextChain) {
        this.chain = nextChain;
    }

    @Override
    void dispense(Change change) {
        int num = change.getChange();
        System.out.println("Dispensing " + num + " 1₩ coin");
    }
}
