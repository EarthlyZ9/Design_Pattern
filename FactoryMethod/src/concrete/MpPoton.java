package concrete;

import framework.Item;

public class MpPoton implements Item {
    @Override
    public void use() {
        System.out.println("마력 회복!");
    }
}
