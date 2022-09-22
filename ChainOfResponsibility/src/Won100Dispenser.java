public class Won100Dispenser extends DispenseChange{
    private DispenseChange chain;

    @Override
    void setNext(DispenseChange nextChain) {
        this.chain = nextChain;
    }

    @Override
    void dispense(Change change) {
        if(change.getChange() >= 100){
            int num = change.getChange() / 100;
            int remainder = change.getChange() % 100;

            System.out.println("Dispensing " + num+ " 100₩ coin");

            if(remainder != 0) this.chain.dispense(new Change(remainder));
        }
        else this.chain.dispense(change); // 다음 체인으로 넘김
    }
}
