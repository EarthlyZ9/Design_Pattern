public class ComputerFactory {

    Blueprint blueprint;

    public void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    public void make() {
        blueprint.setName();
        blueprint.setCpu();
        blueprint.setRam();
        blueprint.setStorage();
    }

    public Computer getComputer() {
        return blueprint.getComputer();
    }


}
