package backend.controller;

import backend.service.IUserService;
import backend.service.UserService;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController implements IUserController {
    private final IUserService service = new UserService();

    @Override
    public List<User> findAll() throws SQLException, IOException {
        return service.findAll();
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return service.findById(id);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return service.deleteById(id);
    }

    @Override
    public User login(String email, String password) throws SQLException, IOException {
        return service.login(email, password);
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        return service.create(fullName, email);
    }
}
