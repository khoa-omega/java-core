package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // Array, List: Key là số nguyên
        // Map: Key có thể là bất cứ kiểu gì

        // Quản lý danh sách theo key - value
        Map<String, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        // Map<Integer, String> map = new TreeMap<>();

        // Thêm 1 phần tử vào map
        map.put("D", "Duy");
        map.put("N", "Nam");
        map.put("H", "Hùng");

        // Xóa 1 phần tử khỏi map
        String name = map.remove("N");
        System.out.println("name = " + name);
    }
}
