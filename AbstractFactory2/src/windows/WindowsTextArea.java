package windows;

import abst.TextArea;

public class WindowsTextArea implements TextArea {
    public WindowsTextArea() {
        System.out.println("Created Windows TextArea");
    }

    @Override
    public String getText() {
        return "Get text from Windows TextArea";
    }
}
