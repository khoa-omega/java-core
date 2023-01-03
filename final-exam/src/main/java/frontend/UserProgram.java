package frontend;

import entity.User;
import entity.User.Role;
import utils.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserProgram {
    public static void main(String[] args) throws IOException, SQLException {
        // JDBCUtils.checkConnection();
        UserFunction function = new UserFunction();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo id");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            if (menu == 1) {
                User user = function.login();
                if (user.getRole() == Role.ADMIN) {
                    function.showAdminMenu();
                } else {
                    function.showEmployeeMenu();
                }
            } else if (menu == 2) {
                function.findAll();
            } else if (menu == 3) {
                function.findById();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }


}
