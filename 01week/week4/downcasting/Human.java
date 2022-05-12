package week4.downcasting;

public class Human extends Animal{

    @Override
    public void behavior() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
