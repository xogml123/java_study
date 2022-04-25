package week1_final.domain;

public class Student {

    private String name;
    private String grade;
    private int deposit;


    public Student(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void takeBus(Bus bus100) {

        this.deposit -= 1000;
        bus100.setIncome(1000);
    }

    public void takeSubway(Subway subwayGreen) {

        this.deposit -= 1200;
        subwayGreen.setIncome(1200);
    }

    public void showInfo() {

        System.out.println(getName() + "님의 남은 돈은 " + getDeposit() + "입니다");
    }
}
