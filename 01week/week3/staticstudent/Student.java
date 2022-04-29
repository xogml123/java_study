package week3.staticstudent;

public class Student {
    private static int serialNum = 1000;
    public String studentName;
    public int studentID;

    public Student() {
        ++serialNum;
        studentID = serialNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return serialNum;
    }
}
