package concrete;

import framework.Item;
import framework.ItemCreator;

import java.util.Date;

public class MpPotionCreator extends ItemCreator {
    @Override
    protected void requestItemInfo() {
        System.out.println("마력 회복 물약에 대한 정보를 가져오기");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복 물약을 새로 생성하였습니다 " + new Date());
    }

    @Override
    protected Item createItem() {
        System.out.println("마력 회복 물약 생성!");
        return new MpPoton();
    }
}
