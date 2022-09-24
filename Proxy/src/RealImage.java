public class RealImage implements Image{
    private final String name;

    public RealImage(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name + " 이미지를 로딩합니다");
    }
}
