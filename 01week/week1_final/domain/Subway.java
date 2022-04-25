package week1_final.domain;

public class Subway {
    private int idx;
    private int cnt = 0;
    private int income;

    public int getIdx() {
        return idx;
    }

    public int getCnt() {
        return cnt;
    }

    public int getIncome() {
        return income;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }


    public void setIncome(int income) {
        this.income = income;
    }

    public Subway(int idx) {
        this.idx = idx;
        this.cnt += 1;
    }

    public void showSubwayInfo() {
        System.out.println(getIdx() + "번 지하철의 승객은 " + getCnt() + "명 이고, 수입은 " + getIncome() + "입니다");
    }
}
