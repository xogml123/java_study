package week1_final.domain;

public class Bus {
    private int idx;
    private int cnt = 0;
    private int income;

    public int getIdx() {
        return idx;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public Bus(int idx) {
        this.idx = idx;
        this.cnt += 1;
    }

    public void showBusInfo() {
        System.out.println(getIdx() + "번 버스의 승객은 " + getCnt() + "명 이고, 수입은 " + getIncome() + "입니다");
    }
}
