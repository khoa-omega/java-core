package frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserProgram {
    // Kiến trúc 3 tầng: Repository -> Service -> Controller
    // Repository: Người lấy nguyên liệu trong kho
    // Service: Người đầu bếp
    // Controller: Người phục vụ

    // JDBC: Java DataBase Connectivity
    // Connection: Kết nối vật lý tới database
    // Statement: Dùng để tạo câu truy vấn KHÔNG có tham số
    // PreparedStatement: Dùng để tạo câu truy vấn có tham số
    // Statement.executeQuery(): Dùng để lấy dữ liệu từ database (SELECT)
    // Statement.executeUpdate(): Dùng để cập nhật dữ liệu trong database (INSERT, UPDATE, DELETE)

    public static void main(String[] args) throws SQLException, IOException {
        // JDBCUtils.checkConnection();

        UserFunction function = new UserFunction();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm user");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Xóa user theo id");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            if (menu == 1) {
                function.create();
            } else if (menu == 2) {
                function.findAll();
            } else if (menu == 3) {
                function.deleteById();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }
}
