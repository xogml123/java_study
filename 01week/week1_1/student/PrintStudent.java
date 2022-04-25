package week1_1.student;
import week1_1.student.Student;


public class PrintStudent {
    private final Student student;

    public PrintStudent(Student student) {
        this.student = student;
    }

    public void exec() {
        System.out.println("--------PrintStudentExec---------\n");

        System.out.println("학번 : " + student.getNum());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getStudentYear() + "학년");
    }

    public void exec2() {
        System.out.println("--------PrintStudentExec2---------\n");
        Student studentLee = new Student();
        studentLee.setName("이순신");
        System.out.println("studentLee = " + studentLee);

    }
}
