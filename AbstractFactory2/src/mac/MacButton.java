package mac;

import abst.Button;

public class MacButton implements Button {
    public MacButton() {
        System.out.println("Created Mac Button!");
    }

    @Override
    public void click() {
        System.out.println("Clicked Mac Button");
    }
}
