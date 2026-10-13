package proglabweek4;


public class Student {
    public int studentID;
    public String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudent() {
        System.out.println("ID: " + studentID + " - İsim: " + name);
    }
}
