package backend.controller;

import backend.service.UserService;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserController {
    private UserService service = new UserService();

    public List<User> findAll() throws SQLException {
        return service.findAll();
    }

    public void create(User user) throws SQLException {
        service.create(user);
    }
}
