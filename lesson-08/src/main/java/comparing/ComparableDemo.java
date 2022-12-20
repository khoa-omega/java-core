package comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Duy"),
                new Student("Hùng"),
                new Student("Cường"),
                new Student("Đức"),
                new Student("Huy")
        );

        System.out.println("------------ Trước khi sắp xếp. ------------");
        for (Student student : students) {
            System.out.println("- student = " + student);
        }

        // Sắp xếp
        Collections.sort(students);

        System.out.println("------------ Sau khi sắp xếp. ------------");
        for (Student student : students) {
            System.out.println("- student = " + student);
        }
    }
}
