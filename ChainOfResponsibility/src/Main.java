/*
    요구사항
    - 동전을 거슬러주는 기계
    - 100원, 10원, 1원 사용
 */
public class Main {
    public static void main(String[] args) {
        DispenseChange chain1 = new Won100Dispenser();
        DispenseChange chain2 = new Won10Dispenser();
        DispenseChange chain3 = new Won1Dispenser();

        chain1.setNext(chain2);
        chain2.setNext(chain3);

        chain1.dispense(new Change(378));
    }
}