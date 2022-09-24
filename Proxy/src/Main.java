/*
    요구 사항
    - 스크롤을 내리면서 읽는 글에 용량이 큰 이미지들이 다량 첨부되어 있다
    - 첫 이미지 네개는 바로 로딩을 하고 밑에 위치한 이미지들의 경우 스크롤이 도달할 때 로딩하도록 한다
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("image1", "image2", "image3", "image4", "image5", "image6");
        final List<Image> images = new ArrayList<>(names.size());
        for (int i = 0; i < names.size(); i++) {
            if (i <= 3) {
                images.add(new RealImage(names.get(i)));
                continue;
            }
            images.add(new ProxyImage(names.get(i)));
        }

        final ListUI listUI = new ListUI(images);
        listUI.onScroll(0, 3);
        System.out.println();
        listUI.onScroll(4, 5);
    }
}