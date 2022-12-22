package backend;

import entity.Student2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise02 {
    public static void question02() {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2(3, "Duy", LocalDate.of(1900, 10, 10), 9.5));
        students.add(new Student2(2, "Duy", LocalDate.of(1900, 10, 10), 6.5));
        students.add(new Student2(4, "Duy", LocalDate.now(), 6.5));
        students.add(new Student2(1, "Duy", LocalDate.of(1800, 10, 10), 6.5));

        Collections.sort(students, Comparator.comparing(Student2::getName)
                .thenComparing(Student2::getBirthDate)
                .thenComparing(Student2::getScore));

        for (Student2 student : students) {
            System.out.println("- student = " + student);
        }
    }
}
