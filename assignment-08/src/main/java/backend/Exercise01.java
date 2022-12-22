package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exercise01 {
    public static void question06_07() {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Duy");
        student.put(2, "Cường");
        student.put(3, "Hùng");

        for (int id : student.keySet()) {
            System.out.println("- id = " + id);
        }

        for (String name : student.values()) {
            System.out.println("- name = " + name);
        }

        Set<String> names = new TreeSet<>(student.values());
        for (String name : names) {
            System.out.println("- name = " + name);
        }
    }

    public static void question05() {
        Set<String> set = new TreeSet<>();
        set.add("Duy");
        set.add("Cường");
        set.add("Đức");
        set.add("Huy");
        for (String name : set) {
            System.out.println("- name = " + name);
        }
    }

    public static void question04() {
        Set<String> set = new LinkedHashSet<>();
        set.add("Duy");
        set.add("Cường");
        set.add("Đức");
        set.add("Huy");
        for (String name : set) {
            System.out.println("- name = " + name);
        }
    }

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

        System.out.println("Đảo ngược vị trí của students.");
        Collections.reverse(students);

        System.out.println("In ra các student có trùng tên");
        question01_i(students);

        for (Student student : students) {
            if (student.getId() == 2) {
                student.setName(null);
            }
        }

        System.out.println("Delete student có id = 5");
        students.removeIf(student -> student.getId() == 5);

        System.out.println("Copy students vào studentCopies");
        List<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(students);
    }

    private static void question01_i(List<Student> students) {
        // Đếm số lần xuất hiện của tên
        Map<String, Integer> map = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            int count = map.getOrDefault(name, 0);
            map.put(name, count + 1);
        }
        // Lấy ra những tên trùng nhau
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > 1) {
                String name = entry.getKey();
                System.out.println("- Student = " + name);
            }
        }
    }
}
