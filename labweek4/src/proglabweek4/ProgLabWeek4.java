package proglabweek4;

import java.util.Scanner;
import java.util.ArrayList;
public class ProgLabWeek4 {

    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("kaç adet kurs olmalı");
        int courseNum = keyb.nextInt();
        while (courseNum < 3) {                                   
            System.out.println("En az 3 kurs olmalı, tekrar gir");
            courseNum = keyb.nextInt();
        }

        ArrayList<Course> courses = new ArrayList<Course>();

        for (int i = 0; i < courseNum; i++) {

            keyb.nextLine();
            System.out.println("Course ismi");
            String x = keyb.nextLine();
            System.out.println("kapasitesi");
            int y = keyb.nextInt();
            courses.add(new Course(x, y));

        }

        System.out.println("Oluşturulan kurslar:");               
        for (Course c : courses) {
            c.showCourse();
        }

        while (true) {
            System.out.println("Menu");
            System.out.println("1 to show courses");
            System.out.println("2 to register student");
            System.out.println("3 exit");

            int secenek = keyb.nextInt();
            if (secenek == 1) {
                for (Course c : courses) {
                    c.showCourse();
                }
            }
            else if (secenek == 2) {

                System.out.println("Student ID");                 
                int stId = keyb.nextInt();
                System.out.println("Student name");
                keyb.nextLine();
                String stName = keyb.nextLine();

                for (Course c : courses) {
                    if (c.capacity != c.studentNum) {
                        c.showCourse();
                    }
                }
                System.out.println("Hangi derse kayıt olunacak");
                String dersName = keyb.nextLine();
                int sayı = 0;
                for (Course c : courses) {

                    if (c.courseName.equals(dersName)) {
                        c.enrollStudents(new Student(stId, stName));
                        sayı += 1;
                        break;
                    }
                }
                if (sayı == 0) {
                    System.out.println("Bu isimde ders bulunamadı");   
                }
            }
            else if (secenek == 3) {
                System.out.println("sistem kapanıyor");
                break;
            }
            else {                                                
                System.out.println("Geçersiz seçim");
            }
        }
    }
    
}
