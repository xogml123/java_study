package week1_2.mydate;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String isValid() {
        String message;

        if ((getYear() % 4 == 0) && (getYear() % 100 != 0) || (getYear() % 400 == 0)){
            message = getYear() + "년 " + getMonth() + "월 " + getDay() + "일은 유효한 날짜입니다.";
        } else {
            message = getYear() + "년 " + getMonth() + "월 " + getDay() + "일은 유효하지 않은 날짜입니다.";
        }
        return message;
    }
}
