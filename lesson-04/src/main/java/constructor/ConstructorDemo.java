package constructor;

// Constructor: Phương thức khởi tạo
// 1. Không có kiểu dữ liệu trả về
// 2. Tên phương thức là tên class

// this: Trỏ đến chính đối tượng đó
// Default constructor: không tham số
public class ConstructorDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Khoa");
        System.out.println("student = " + student);

    }
}
