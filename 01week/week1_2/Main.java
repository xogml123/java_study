package week1_2;

import week1_2.domain.Student;
import week1_2.mydate.MyDate;
import week1_2.thisusage.Animal;

public class Main {
    public static void main(String args[])
    {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());

        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());

        //date1.day = 10; //에러 'day' has private

        Animal cat = new Animal("cat");
        System.out.println("cat.getMyReference() = " + cat.getMyReference());
        System.out.println("cat = " + cat);
        // 참조 자료형 변수
        Student studentLee = new Student(1001, "Lee");

        studentLee.setKorean("국어", 100);
        studentLee.setMath("수학", 50);

        Student studnetKim = new Student(1002, "Kim");

        studnetKim.setKorean("국어", 70);
        studnetKim.setMath("수학", 85);

        studentLee.showStudentInfo();
        studnetKim.showStudentInfo();


    }

}
