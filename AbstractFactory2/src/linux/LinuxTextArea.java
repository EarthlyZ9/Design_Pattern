package linux;

import abst.TextArea;

public class LinuxTextArea implements TextArea {
    public LinuxTextArea() {
        System.out.println("Created Linux TextArea!");
    }

    @Override
    public String getText() {
        return "Get text from Linux TextArea";
    }
}
