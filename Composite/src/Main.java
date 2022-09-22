/*
    요구사항
    - 리눅스 파일 시스템 구축
    - 사진 참고
    - garam -> jisoo
 */

public class Main {
    public static void main(String[] args) {
        Folder
                root = new Folder("root"),
                home = new Folder("home"),
                jisoo = new Folder("jisoo"),
                music = new Folder("music"),
                picture = new Folder("picture"),
                doc = new Folder("doc"),
                usr = new Folder("usr");

        File
                track1 = new File("track1"),
                track2 = new File("track2"),
                pic1 = new File("pic1"),
                doc1 = new File("doc1"),
                java = new File("java");

        root.addComponent(home);
//        System.out.println(root.getChildren());
        home.addComponent(jisoo);
        jisoo.addComponent(music);
        music.addComponent(track1);
        music.addComponent(track2);
        jisoo.addComponent(picture);
        picture.addComponent(pic1);
        jisoo.addComponent(doc);
        doc.addComponent(doc1);
        root.addComponent(usr);
        usr.addComponent(java);

        show(root);


    }

    private static void show(Component component) {
        System.out.println(component.getClass().getName() + "|" + component.getName());
        if (component instanceof Folder) {
            for (Component c : ((Folder)component).getChildren()) {
                show(c);
            }
        }
    }
}