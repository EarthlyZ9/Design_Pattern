package mac;

import abst.TextArea;

public class MacTextArea implements TextArea {
    public MacTextArea() {
        System.out.println("Created Mac TextArea");
    }

    @Override
    public String getText() {
        return "Get text from Mac TextArea";
    }
}
