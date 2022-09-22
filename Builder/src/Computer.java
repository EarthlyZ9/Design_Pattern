public class Computer {

    private String name;
    private String cpu;
    private String ram;
    private String storage;

    public Computer(String name, String cpu, String ram, String storage) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return name +": " + cpu + ", " + ram + ", " + storage;
    }
}
