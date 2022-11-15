package Test.doituong;

import java.time.Instant;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Instant createAT = Instant.now();

        Student st1 = new Student("hoang", 18, 1.65f,createAT,createAT);
        students.add(st1);
        System.out.println(st1);
        Student st2 = new Student("tran", 18, 1.65f,createAT,createAT);
        students.add(st2);
        System.out.println(st2);
        System.out.println("-----------------");
        for (Student st : students) {
            System.out.println(st);
        }
    }
}
