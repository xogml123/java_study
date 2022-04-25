package week1_1.printname;

public class PrintName {

    private String name;

    public PrintName() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrintName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("My name is = " + name);
    }
}
