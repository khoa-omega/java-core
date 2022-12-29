package backend.repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    /**
     * @return Danh sách user trong database
     * @throws SQLException Khi có lỗi về cú pháp SQL
     * @throws IOException Khi có lỗi về đường dẫn tới file database.properties
     */
    List<User> findAll() throws SQLException, IOException;

    void create(User user) throws SQLException, IOException;

    int update(User user) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;
}
