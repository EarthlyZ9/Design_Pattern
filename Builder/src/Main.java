/*
    요구사항
    - 다양한 컴퓨터를 만들 수 있음
    - 각 종류에 대한 blueprint 존재
    - Computer 클래스는 name, cpu, ram, storage 속성을 가짐
 */

public class Main {
    public static void main(String[] args) {
        ComputerFactory lgFactory = new ComputerFactory();
        lgFactory.setBlueprint(new LgGramBlueprint());
        lgFactory.make();

        Computer lgComputer = lgFactory.getComputer();
        System.out.println(lgComputer.toString());

        ComputerFactory appleFactory = new ComputerFactory();
        appleFactory.setBlueprint(new MacBlueprint());
        appleFactory.make();

        Computer appleComputer = appleFactory.getComputer();
        System.out.println(appleComputer.toString());
    }
}