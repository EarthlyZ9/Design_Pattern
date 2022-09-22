abstract class DispenseChange {
    abstract void setNext(DispenseChange nextChain);
    abstract void dispense(Change change);
}
