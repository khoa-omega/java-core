package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/user_management?user=root&password=root";
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url);
        }
        return connection;
    }

    public static void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public static void checkConnection() {
        String url = "jdbc:mysql://localhost:3306/user_management?user=root&password=root";
        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println("Kết nối thành công.");
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
        }
    }
}
