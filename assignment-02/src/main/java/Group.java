import java.time.LocalDateTime;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDateTime createdDate;
    Account[] accounts;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
