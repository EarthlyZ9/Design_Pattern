import java.util.List;

public class ListUI {
    private List<Image> images;

    public ListUI(List<Image> images) {
        this.images = images;
    }

    public void onScroll(final int start, final int end) {
        for (int i = start; i <= end; i++) {
            final Image image = images.get(i);
            image.draw();
        }
    }
}
