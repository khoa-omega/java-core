package backend.service;

import backend.repository.UserRepository;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private UserRepository repository = new UserRepository();

    public List<User> findAll() throws SQLException {
        return repository.findAll();
    }

    public void create(User user) throws SQLException {
        repository.create(user);
    }
}
