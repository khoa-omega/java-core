package backend.service;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findAll() throws SQLException, IOException;

    User findById(int id) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;

    User login(String email, String password) throws SQLException, IOException;

    int create(String fullName, String email) throws SQLException, IOException;
}
