package flowcontrol;

public class WhileDemo {
    public static void main(String[] args) {
        // While: Kiểm tra điều kiện trước khi chạy khối lệnh

        int age = 1;
        while (age < 0) {
            System.out.println("Tuổi của bạn là: " + age);
            age = age + 1;
        }
    }
}
