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

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
