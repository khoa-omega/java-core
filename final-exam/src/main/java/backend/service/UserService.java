package backend.service;

import backend.repository.IUserRepository;
import backend.repository.UserRepository;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private final IUserRepository repository = new UserRepository();

    @Override
    public List<User> findAll() throws SQLException, IOException {
        return repository.findAll();
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return repository.findById(id);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return repository.deleteById(id);
    }

    @Override
    public User login(String email, String password) throws SQLException, IOException {
        return repository.login(email, password);
    }

    @Override
    public int create(String fullName, String email) throws SQLException, IOException {
        return repository.create(fullName, email);
    }
}
