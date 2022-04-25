package week1_2.thisusage;

public class Animal {
    public String type;
    public Boolean alive;

    public Animal() {
        System.out.println("Default Constructor Called.");
        alive = true;
    }

    public Animal(String type) {
        this();
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal getMyReference(){
        return this;
    }
}
