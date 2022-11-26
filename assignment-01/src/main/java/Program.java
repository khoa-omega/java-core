import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";
        System.out.println("department = " + department);

        Position position = new Position();
        position.id = 1;
        position.name = PositionName.PM;
        System.out.println("position = " + position);

        Account account = new Account();
        account.id = 1;
        account.email = "khoa.nv@gmail.com";
        account.fullName = "Nguyễn Văn Khoa";
        account.username = "khoa.nv";
        account.department = department;
        account.position = position;
        account.createdDate = LocalDateTime.now();
        System.out.println("account = " + account);
    }
}
