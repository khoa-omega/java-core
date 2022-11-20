import java.time.LocalDateTime;
import java.util.Arrays;

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
