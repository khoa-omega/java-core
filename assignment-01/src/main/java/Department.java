// Class dùng để làm gì?
// 1. Chạy code Java
// 2. Tạo ra một kiểu dữ liệu mới
public class Department {
    // Class gồm 2 phần
    // 1. Thuộc tính: property
    int id;
    String name;
    Account[] accounts;

    public Department() {
    }

    public Department(String name) {
        this.id = 0;
        this.name = name;
    }

    // 2. Phương thức: method
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Department that = (Department) object;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
