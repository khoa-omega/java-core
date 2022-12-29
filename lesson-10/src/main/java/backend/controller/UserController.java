package backend.controller;

import backend.service.IUserService;
import backend.service.UserService;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController {
    private IUserService service = new UserService();

    public List<User> findAll() throws SQLException, IOException {
        return service.findAll();
    }

    public void create(User user) throws SQLException, IOException {
        service.create(user);
    }

    public int update(User user) throws SQLException, IOException {
        return service.update(user);
    }

    public int deleteById(int id) throws SQLException, IOException {
        return service.deleteById(id);
    }
}
