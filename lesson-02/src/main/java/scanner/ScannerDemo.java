package scanner;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào một từ
        System.out.println("Nhập vào tên của bạn:");
        String name = scanner.next();
        System.out.println("Tên của bạn là: " + name);

        // Ăn bỏ kí tự ENTER hoặc SPACE
        scanner.nextLine();

        // Nhập vào một chuỗi
        System.out.println("Nhập vào họ và tên của bạn:");
        String fullName = scanner.nextLine();
        System.out.println("Họ và tên của bạn là: " + fullName);

        // Chú ý: Nếu trước nextLine() không phải là một nextLine()
        // => Cần ăn bỏ kí tự SPACE, ENTER.

        // Nhập vào một số nguyên
        // Kiểm tra định dạng đầu vào
        while (true) {
            System.out.println("Nhập vào tuổi của bạn:");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                System.out.println("Tuổi của bạn là: " + age);
                break;
            } else {
                scanner.nextLine();
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }

        // Convert String to LocalDate
        System.out.println("Nhập vào ngày sinh của bạn (yyyy-MM-dd):");
        String str = scanner.next();
        LocalDate birthday = LocalDate.parse(str);
        System.out.println("birthday = " + birthday);

        scanner.close();
    }
}
