package frontend;

import backend.controller.UserController;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserFunction {
    private UserController controller = new UserController();

    public void findAll() throws SQLException, IOException {
        List<User> users = controller.findAll();
        System.out.println("+------+--------------------+--------------------+--------------------+");
        System.out.println("|  ID  |        NAME        |        EMAIL       |       PASSWORD     |");
        System.out.println("+------+--------------------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String name = user.getName();
                String email = user.getEmail();
                String password = user.getPassword();
                System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", id, name, email, password);
                System.out.println("+------+--------------------+--------------------+--------------------+");
            }
        }
    }

    public void create() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin user.");
        User user = new User();

        System.out.println("Nhập vào name:");
        String name = scanner.next();
        user.setName(name);

        System.out.println("Nhập vào email:");
        String email = scanner.next();
        user.setEmail(email);

        System.out.println("Nhập vào password:");
        String password = scanner.next();
        user.setPassword(password);

        controller.create(user);
        System.out.println("Thêm thành công.");
    }

    public void deleteById() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id cần xóa:");
        int id = scanner.nextInt();
        controller.deleteById(id);
        System.out.println("Xóa thành công.");
    }
}
