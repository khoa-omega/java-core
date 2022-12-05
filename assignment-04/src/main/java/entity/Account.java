package entity;

import java.time.LocalDateTime;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDateTime createdDate;
    Group[] groups;

    public Account() {
    }

    public Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + lastName;
    }

    public Account(int id, String email, String username, String firstName, String lastName, Position position) {
        this(id, email, username, firstName, lastName);
        this.position = position;
        this.createdDate = LocalDateTime.now();
    }

    public Account(int id, String email, String username, String firstName, String lastName, Position position, LocalDateTime createdDate) {
        this(id, email, username, firstName, lastName);
        this.position = position;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "entity.Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
