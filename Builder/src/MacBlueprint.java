public class MacBlueprint extends Blueprint{
    Computer computer;

    public MacBlueprint() {
        computer = new Computer("default", "default", "default", "default");
    }

    @Override
    public void setName() {
        computer.setName("Macbook");
    }

    @Override
    public void setCpu() {
        computer.setCpu("m2");
    }
    @Override
    public void setRam() {
        computer.setRam("16g");
    }
    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
