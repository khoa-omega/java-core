package frontend;

import backend.controller.UserController;
import entity.User;
import utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

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

    public static void main(String[] args) throws SQLException {
        // JDBCUtils.checkConnection();

        UserController controller = new UserController();
        // Create new user
        User user = new User(1, "Khoa", "khoa.nv@gmail.com", "root");
        controller.create(user);
        // Find all users
        List<User> users = controller.findAll();
        for (User u : users) {
            System.out.println("- User = " + u);
        }
    }
}
