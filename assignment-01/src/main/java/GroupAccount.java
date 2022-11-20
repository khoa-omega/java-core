import java.time.LocalDateTime;

public class GroupAccount {
    Group group;
    Account account;
    LocalDateTime joinedDate;

    @Override
    public String toString() {
        return "GroupAccount{" +
                "group=" + group.name +
                ", account=" + account.username +
                ", joinedDate=" + joinedDate +
                '}';
    }
}
