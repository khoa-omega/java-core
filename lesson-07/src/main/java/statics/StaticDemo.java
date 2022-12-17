package statics;

// static: Thuộc về cả class (tập thể)
// Có thể dùng ở class, property, method

// 1. Tiết kiệm bộ nhớ
// 2. Bộ nhớ chỉ được giải phóng khi chương trình kết thúc
// 3. Static method chỉ gọi được static method khác
public class StaticDemo {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println("math.sum(1, 1) = " + math.sum(1, 1));

        System.out.println("MyMath.PI = " + MyMath.PI);
        System.out.println("MyMath.sum(1, 2, 3) = " + MyMath.sum(1, 2, 3));
    }
}
