package windows;

import abst.Button;

public class WindowsButton implements Button {
    public WindowsButton() {
        System.out.println("Created Windows Button!");
    }

    @Override
    public void click() {
        System.out.println("Clicked Windows Button");
    }
}
