package windows;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class WindowsGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowsTextArea();
    }
}
