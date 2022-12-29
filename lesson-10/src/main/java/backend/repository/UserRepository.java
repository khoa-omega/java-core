package backend.repository;

import entity.User;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException {
        String sql = "SELECT * FROM `user`";
        try (
                Connection connection = JDBCUtils.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                User user = new User(id, name, email, password);
                users.add(user);
            }
            return users;
        }
    }

    public void create(User user) throws SQLException {
        String sql = "INSERT INTO `user`(`name`, email, `password`) VALUES (?, ?, ?)";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setString(1, user.getName());
            pStmt.setString(2, user.getEmail());
            pStmt.setString(3, user.getPassword());
            pStmt.executeUpdate();
        }
    }

    public int update(User user) throws SQLException {
        String sql = "UPDATE `user` SET `name` = ?, email = ?, `password` = ? WHERE id = ?";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setString(1, user.getName());
            pStmt.setString(2, user.getEmail());
            pStmt.setString(3, user.getPassword());
            pStmt.setInt(4, user.getId());
            return pStmt.executeUpdate();
        }
    }

    public int deleteById(int id) throws SQLException {
        String sql = "DELETE FROM `user` WHERE id = ?";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setInt(1, id);
            return pStmt.executeUpdate();
        }
    }
}
