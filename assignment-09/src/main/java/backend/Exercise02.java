package backend;

import entity.Student;

import java.util.Calendar;
import java.util.Date;

public class Exercise02 {
    public static void question01() {
        @SuppressWarnings("deprecation")
        Date date = new Date(2020, Calendar.MAY, 18);
    }

    public static void question02() {
        Student student = new Student("Nguyễn Văn A");

        System.out.println("Student = " + student);
        System.out.println("Id = " + student.getId());
        System.out.println("Id v2 = " + student.getIdV2());
    }
}
