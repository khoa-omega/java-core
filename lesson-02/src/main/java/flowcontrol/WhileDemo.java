package flowcontrol;

public class WhileDemo {
    public static void main(String[] args) {
        // While: Chạy khối lệnh ít nhất 0 lần

        int age = 1;

        while (age < 0) {
            System.out.println("Tuổi của bạn là: " + age);
            age = age + 1;
        }
    }
}
