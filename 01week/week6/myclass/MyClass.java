package week6.myclass;

public class MyClass implements  MyInterface{

    @Override
    public void myMethod() {
        System.out.println("MyClass.myMethod");
    }

    @Override
    public void x() {
        System.out.println("MyClass.X");
    }

    @Override
    public void y() {
        System.out.println("MyClass.Y");
    }
}
