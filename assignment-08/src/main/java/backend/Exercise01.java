package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void question01() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Duy"));
        students.add(new Student("Duy"));
        students.add(new Student("Duy"));
        students.add(new Student("Nam"));
        students.add(new Student("Cường"));

        System.out.println("Tổng phần tử của students = " + students.size());
        System.out.println("Phần tử thứ 4 của students = " + students.get(3));

        System.out.println("Phần tử đầu tiên của students = " + students.get(0));
        System.out.println("Phần tử cuối cùng của students = " + students.get(students.size() - 1));

        System.out.println("Thêm 1 phần tử vào vị trí đầu của students.");
        students.add(0, new Student("Đức"));
        System.out.println("Thêm 1 phần tử vào vị trí cuối của students.");
        students.add(new Student("Tùng"));
    }
}
