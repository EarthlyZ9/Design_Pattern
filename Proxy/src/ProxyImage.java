public class ProxyImage implements Image{
    private String name;
    private RealImage image;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        if (image == null) {
            image = new RealImage(name);
        }
        System.out.println(name +" 이미지의 프록시를 이용합니다");
        image.draw();
    }
}
