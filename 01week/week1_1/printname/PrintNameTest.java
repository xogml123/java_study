package week1_1.printname;

public class PrintNameTest {
    private final PrintName target;

    public PrintNameTest() {
        this.target = new PrintName();
    }

    public void test() {
        System.out.println("--------PrintNameTest---------\n");

        target.setName("takim");
        target.print();
        target.setName("wochae");
        target.print();
        target.setName("1123___abc!!");
        target.print();
    }
}
