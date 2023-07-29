import java.time.LocalDate;
import java.time.LocalDateTime;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createdDate;
    Account[] accounts;
}
