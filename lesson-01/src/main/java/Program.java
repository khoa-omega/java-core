import java.time.LocalDateTime;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        // Cú pháp khởi tạo biến
        // <Kiểu dữ liệu> <Tên biến> [= <Giá trị khởi tạo>];

        // Kiểu số nguyên: byte (1), short (2), int (4), long (8)
        byte age = 18;
        System.out.println("age = " + age);

        // Kiểu số thực: float (4), double (8)
        float fScore = 9.9999999f;
        double dScore = 9.9999999;
        System.out.println("fScore = " + fScore);
        System.out.println("dScore = " + dScore);

        // Kiểu kí tự: char (2)
        // Bọc kí tự trong dấu nháy đơn (')
        char c = '☁';
        System.out.println("c = " + c);

        // Kiểu chuỗi: String
        // Bọc chuỗi trong dấu nháy kép (")
        String name = "☁☁☁☁☁";
        System.out.println("name = " + name);

        // Kiểu logic: boolean (1)
        // Chỉ có 2 giá trị đúng hoặc sai: true or false
        boolean hasMoney = false;
        System.out.println("hasMoney = " + hasMoney);

        // Kiểu thời gian: LocalDate, LocalTime, LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        // Kiểu tập hợp: Enum
        Gender gender = Gender.FEMALE;
        System.out.println("gender = " + gender);

        // Kiểu mảng: Array
        String[] fruits = {"Nho", "Táo", "Cam"};
        float[] scores = new float[] {8.5f, 7.5f, 5.0f};
        System.out.println("fruits = " + Arrays.toString(fruits));
        System.out.println("scores = " + Arrays.toString(scores));

        // Testing System 01
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";
        System.out.println("departmentA = " + departmentA);

        Position positionA = new Position();
        positionA.id = 1;
        positionA.name = PositionName.DEV;
        System.out.println("positionA = " + positionA);
    }
}
