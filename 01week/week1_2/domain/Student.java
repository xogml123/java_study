package week1_2.domain;

public class Student {

    private int studentID;
    private String studentName;
    private final Subject korea = new Subject();
    private final Subject math = new Subject();

    public Student(int studentID, String studentName) {

        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setKorean(String subjectName, int subjectScore){
        korea.setSubjectName(subjectName);
        korea.setSubjectScore(subjectScore);
    }

    public void setMath(String subjectName, int subjectScore){
        math.setSubjectName(subjectName);
        math.setSubjectScore(subjectScore);
    }

    public Subject getKorean() {
        return korea;
    }

    public Subject getMath() {
        return math;
    }

    public void showStudentInfo() {
        System.out.println("학생 " + getStudentName() + "의 총점은 " + totalScore() + "입니다.");
    }

    private int totalScore() {
        return korea.getSubjectScore() + math.getSubjectScore();
    }
}
