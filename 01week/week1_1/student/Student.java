package week1_1.student;


public class Student {

   private Long num;
   private String name;
   private Integer studentYear;

    public Student() {
    }

    public Student(Long num, String name, Integer studentYear) {
        this.num = num;
        this.name = name;
        this.studentYear = studentYear;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(Integer studentYear) {
        this.studentYear = studentYear;
    }
}
