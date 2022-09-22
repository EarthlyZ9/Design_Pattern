import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import linux.LinuxGuiFac;
import mac.MacGuiFac;
import windows.WindowsGuiFac;

public class Main {
    public static void main(String[] args) {
        // Linux
        GuiFac linuxFac = new LinuxGuiFac();
        Button linuxButton = linuxFac.createButton();
        TextArea linuxTextArea = linuxFac.createTextArea();

        linuxButton.click();
        System.out.println(linuxTextArea.getText());

        // Mac
        GuiFac macFac = new MacGuiFac();
        Button macButton = macFac.createButton();
        TextArea macTextArea = macFac.createTextArea();

        macButton.click();
        System.out.println(macTextArea.getText());

        // Windows
        GuiFac windowsFac = new WindowsGuiFac();
        Button windowsButton = windowsFac.createButton();
        TextArea windowsTextArea = windowsFac.createTextArea();

        windowsButton.click();
        System.out.println(windowsTextArea.getText());
    }
}