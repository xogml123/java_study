package week3.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private int studentNumber;

    private final ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int studentNumber, String name) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public void addSubject(String subjectName, int subjectScore ) {
        Subject subject = new Subject(subjectName, subjectScore);
        subjects.add(subject);
    }

    public void showStudentInfo() {
        for (Subject subject : subjects) {
            System.out.println("학생 " + name +"의 "+subject.getSubjectName()+" 과목 성적은 " + subject.getSubjectScore()+"점 입니다.");
        }
        System.out.println("학생 " + name +"의 총점은 " + sumScore() + "입니다.");
    }

    private int sumScore() {
//        int sum = 0;
//        for (Subject subject : subjects) {
//            sum += subject.getSubjectScore();
//        }

        int sum = subjects.stream().mapToInt((subject) -> (subject.getSubjectScore())).sum();
        return (sum);
    }
}

