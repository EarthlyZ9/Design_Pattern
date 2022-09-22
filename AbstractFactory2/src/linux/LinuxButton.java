package linux;

import abst.Button;

public class LinuxButton implements Button {
    public LinuxButton() {
        System.out.println("Created Linux Button!");
    }

    @Override
    public void click() {
        System.out.println("Clicked Linux Button");
    }
}
