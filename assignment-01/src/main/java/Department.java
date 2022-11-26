// Class dùng để làm gì?
// 1. Chạy code Java
// 2. Tạo ra một kiểu dữ liệu mới
public class Department {
    // Class gồm 2 phần
    // 1. Thuộc tính: property
    int id;
    String name;
    Account[] accounts;

    // 2. Phương thức: method
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
