package week1_1.person;

public class Person {

    private String name;
    private Integer age;
    private Gender gender;
    private Married married;
    private Integer child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Married getMarried() {
        return married;
    }

    public void setMarried(Married married) {
        this.married = married;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public Person() {
    }

    public Person(String name, Integer age, Gender gender, Married married, Integer child) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.child = child;
    }

    public void print() {
        System.out.println("이름은 "+ name +"이고 나이는 "+age+"살 입니다.\n"
            + "성별은 "+gender+"이며, "+married+" 입니다. 자녀는 "+child+"명이 있습니다.” \n");
    }
}
