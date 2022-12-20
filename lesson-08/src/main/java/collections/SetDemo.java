package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Tập hợp các phần tử riêng biệt
        // Set<String> set = new HashSet<>();
        // Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();

        // Thêm 1 phần tử vào tập hợp
        set.add("Duy");
        set.add("Duy");
        set.add("Duy");
        set.add("Hùng");
        set.add("Cường");
        set.add("Nam");

        for (String name : set) {
            System.out.println("- name = " + name);
        }
    }
}
