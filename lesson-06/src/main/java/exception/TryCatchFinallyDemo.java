package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// Nếu không xử lý exception => Chương trình sẽ bị dừng

// Trong khối lệnh try, khi gặp exception
// => Ngay lập tức thoát ra khỏi try

// Một số exceptions hay gặp
// - ArithmeticException
// - ArrayIndexOutOfBoundsException
// - InputMismatchException
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        divide(7, 0);

        try {
            String[] fruits = {"Táo", "Cam", "Đào"};
            System.out.println("fruits[100] = " + fruits[100]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào tuổi:");
            int age = scanner.nextInt();
            System.out.println("age = " + age);
        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void divide(int a, int b) {
        try {
            // Khối lệnh có thể xảy ra exception
            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            // Khối lệnh xử lý khi xảy ra arithmetic exception
            System.out.println(a > 0 ? "Dương vô cùng" : "Âm vô cùng");
        } catch (Exception exception) {
            // Khối lệnh xử lý khi xảy ra exception
            System.out.println("Lỗi không mong muốn.");
        } finally {
            // Khối lệnh luôn được chạy
            System.out.println("Thu hồi tài nguyên.");
        }
    }
}
