package framework;

public abstract class ItemCreator {

    public Item create() {
        // 템플릿 메소드 처럼 스템별로 나뉘어짐
        Item item;
        requestItemInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    // 아이템 생성 전 아이템 정보 요청 (DB)
    abstract protected void requestItemInfo();
    // 아이템 생성 후 아이템 복제 등의 문제를 방지하기 위해 로그를 남김 (DB)
    abstract protected void createItemLog();
    // 아이템 생성
    abstract  protected Item createItem();

}
