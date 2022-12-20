package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // Tạo list có thể thêm - sửa - xóa phần tử
        // List<String> fruits = new LinkedList<>();
        // List<String> fruits = new ArrayList<>();
        // fruits.add("Cam");
        // fruits.add("Táo");

        // Tạo list cố định (không thể thêm - sửa - xóa)
        List<String> fruits = Arrays.asList("Cam", "Táo");
        // fruits.add("Dưa hấu"); => Lỗi

        System.out.println("fruits.size() = " + fruits.size());
        System.out.println("fruits.isEmpty() = " + fruits.isEmpty());
        System.out.println("fruits.contains(\"Cam\") = " + fruits.contains("Cam"));
    }
}
