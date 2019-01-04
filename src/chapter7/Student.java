package chapter7;

import java.util.ArrayList;

public class Student {
    int studentIDs;
    String studentName;
    ArrayList<Subject> subjectsList;

    public Student(int studentIDs, String studentName) {
        this.studentIDs = studentIDs;
        this.studentName = studentName;
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectsList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s : subjectsList) {
            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
