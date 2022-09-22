public class LgGramBlueprint extends Blueprint {

    private Computer computer;

    public LgGramBlueprint() {
        computer = new Computer("default", "default", "default", "default");
    }

    @Override
    public void setName() {
        computer.setName("LG Gram");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i9");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("128g ssd  ");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
