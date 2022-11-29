package out;

import java.util.Locale;

public class OutDemo {
    public static void main(String[] args) {
        // Kí tự xuống dòng: \n
        // Kí tự nháy đơn: \'
        System.out.println("c = " + '\'');

        // Kí tự nháy kép: \"
        System.out.println("Hello \"Java core\"");

        // println: Print with new line
        System.out.println();
        System.out.println("Hello Java core");

        // print: Print with no new line
        System.out.print("Hello \n Java core\n\n\n\n\n\n\n");
        System.out.print("Hello Java core\n");

        // printf: Print with formatting
        // %n: Xuống dòng
        // %s: Đại diện cho chuỗi
        // %S: Đại diện cho chuỗi (upper case)
        // %d: Đại diện cho số nguyên
        // %f: Đại diện cho số thực
        // %10s: Căn lề phải cho chuỗi (Thêm dấu cách bên trái sao cho đủ 10 kí tự)
        // %-10s: Căn lề trái cho chuỗi (Thêm dấu cách bên phải sao cho đủ 10 kí tự)
        // %.2f: Làm tròn 2 chữ số phần thập phân
        // %,d: Định dạng số
        String name = "Khoa";
        int age = 18;
        double score = 8.5;
        System.out.println("name = " + name + ", age = " + age + ", score = " + score);
        System.out.printf("name = %-10S, age = %d, score = %10.2f%n", name, age, score);
        System.out.printf(new Locale("vi", "VN"), "%,d", 10000);
    }
}
