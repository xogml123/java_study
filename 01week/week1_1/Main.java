package week1_1;

import week1_1.opeartor.OperatorTest;
import week1_1.person.Gender;
import week1_1.person.Married;
import week1_1.person.Person;
import week1_1.printname.PrintNameTest;
import week1_1.student.PrintStudent;
import week1_1.student.Student;

public class Main {

    public static void main(String args[]) {

        PrintNameTest printNameTest = new PrintNameTest();
        printNameTest.test();

        OperatorTest operatorTest = new OperatorTest();
        operatorTest.test();

        PrintStudent printStudent = new PrintStudent(new Student(1001L, "홍길동", 2));
        printStudent.exec();
        printStudent.exec2();

        Person person = new Person("제인", 30, Gender.FEMALE, Married.기혼자, 1);
        person.print();

        Person person2 = new Person();
        person2.setName("제인");
        person2.setAge(30);
        person2.setGender(Gender.FEMALE);
        person2.setMarried(Married.기혼자);
        person2.setChild(1);
        person2.print();

    }
}