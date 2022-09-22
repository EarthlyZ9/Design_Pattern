/* 요구사항
    게임 아이템과 아이템 생성의 구현
    - 아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청
    - 아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성 정보를 남김
    - 모든 아이템은 기본적으로 use() 함수를 갖고 있음
 */

import concrete.HpPotionCreator;
import concrete.MpPotionCreator;
import framework.ItemCreator;
import framework.Item;


public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpPotionCreator();
        item = creator.create();
        item.use();

        creator = new MpPotionCreator();
        item = creator.create();
        item.use();
    }
}