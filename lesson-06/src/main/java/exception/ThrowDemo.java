package exception;

// Throw: Cố ý ném ra lỗi thay vì chờ hệ thống
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            goToJapan(15);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void goToJapan(int age) {
        if (age >= 18) {
            System.out.println("Going to Japan...");
        } else {
            throw new IllegalStateException("Bạn chưa đủ 18 tuổi.");
        }
    }
}
