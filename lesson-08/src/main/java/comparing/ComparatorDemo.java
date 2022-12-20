package comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
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
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        System.out.println("------------ Sau khi sắp xếp. ------------");
        for (Student student : students) {
            System.out.println("- student = " + student);
        }
    }
}
