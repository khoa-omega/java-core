package generic;

import java.util.Arrays;
import java.util.List;

// Generic: Chỉ dùng với kiểu object
// => Không dùng được với kiểu nguyên thủy
// Có thể sử dụng cho property, method

// Kí tự viết tắt và ý nghĩa
// T: Type
// E: Element
// N: Number
// K: Key
// V: Value

// Wildcard: ?, extends, super
// ?: Không quan tâm đến kiểu dữ liệu
public class GenericDemo {
    public static void main(String[] args) {
        Circle<Integer> circle = new Circle<>(100);
        System.out.println("circle = " + circle);

        // Generic for method
        showInfo(circle);
        showInfo("Hùng");
        showInfo(100);

        // Wildcard
        List<Integer> scores = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("length(scores) = " + length(scores));
    }

    private static int length(List<?> list) {
        return list.size();
    }

    private static <T> void showInfo(T object) {
        System.out.println("showInfo(): " + object);
    }
}
