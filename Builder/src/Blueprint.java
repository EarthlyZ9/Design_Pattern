public abstract class Blueprint {

    abstract void setName();
    abstract void setCpu();
    abstract void setRam();
    abstract void setStorage();

    abstract Computer getComputer();
}
