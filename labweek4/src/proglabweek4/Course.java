package proglabweek4;

import java.util.ArrayList;
public class Course {
    public String courseName;
    public ArrayList<Student> enrolledStudents;
    public int capacity;
    public int studentNum;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<Student>();
        this.capacity = capacity;
        studentNum = 0;
    }

    public void enrollStudents(Student s) {

        if (studentNum == capacity) {
            System.out.println("Bu ders dolu");
        }
        else {
            int sayı = 0;
            for (Student s1 : enrolledStudents) {
                if (s.studentID == s1.studentID) {
                    sayı += 1;
                }
            }
            if (sayı == 0) {
                System.out.println("başarılı kayıt");
                enrolledStudents.add(s);
                studentNum += 1;
            }
            if (sayı != 0) {
                System.out.println("Bu öğrenci zaten kayıtlı");
            }
        }
    }

    public void showCourse() {
        System.out.println("Course name: " + courseName + " Capacity: " + capacity + " Enrolled: " + studentNum);
        for (Student s : enrolledStudents) {
            s.showStudent();
        }
    }
}
