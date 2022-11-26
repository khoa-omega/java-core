package flowcontrol;

public class DoWhileDemo {
    public static void main(String[] args) {
        // Do while: Chạy khối lệnh trước khi kiểm tra điều kiện
        // => Chạy khối lệnh ít nhất 1 lần

        int age = 1;
        do {
            System.out.println("Tuổi của bạn là: " + age);
            age = age + 1;
        } while (age < 0);
    }
}
