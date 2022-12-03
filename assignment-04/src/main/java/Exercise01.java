import java.time.LocalDateTime;

public class Exercise01 {
    private static void question01() {
        Department departmentA = new Department();
        Department departmentB = new Department("Giám đốc");
    }

    private static void question02() {
        Account accountA = new Account();
        Account accountB = new Account(1, "khoa.nv@gmail.com", "khoa.nv", "Khoa", "Nguyễn Văn");
        Account accountC = new Account(2, "khoa.nv@gmail.com", "khoa.nv", "Khoa", "Nguyễn Văn", new Position());
        Account accountD = new Account(3, "khoa.nv@gmail.com", "khoa.nv", "Khoa", "Nguyễn Văn", new Position(), LocalDateTime.now());
    }

    private static void question03() {
        Group groupA = new Group();
        Group groupB = new Group("Java core", new Account(), LocalDateTime.now(), new Account[]{new Account()});
        Group groupC = new Group("Java core", new Account(), LocalDateTime.now(), new String[]{"khoa.nv"});
    }
}
