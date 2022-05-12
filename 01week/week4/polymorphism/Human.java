package week4.polymorphism;

public class Human implements Animal{

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}
