import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise05 {
    private static final Scanner scanner = new Scanner(System.in);

    private static void question01() {
        System.out.println("Mời bạn nhập vào 3 số nguyên.");

        System.out.println("Nhập vào số thứ 1:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số thứ 2:");
        int b = scanner.nextInt();

        System.out.println("Nhập vào số thứ 3:");
        int c = scanner.nextInt();

        System.out.printf("Bạn vừa nhập vào 3 số nguyên là: %d, %d và %d.%n", a, b, c);
    }

    private static void question02() {
        System.out.println("Mời bạn nhập vào 2 số thực.");

        System.out.println("Nhập vào số thứ 1:");
        double a = scanner.nextDouble();

        System.out.println("Nhập vào số thứ 2:");
        double b = scanner.nextDouble();

        System.out.printf("Bạn vừa nhập vào 2 số thực là: %f và %f.%n", a, b);
    }

    private static void question03() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        System.out.printf("Bạn vừa nhập vào họ và tên là: %s.%n", fullName);
    }

    private static void question04() {
        System.out.println("Mời bạn nhập vào ngày sinh.");

        System.out.println("Nhập vào ngày sinh (yyyy-MM-dd):");
        LocalDate birthdate = LocalDate.parse(scanner.next());

        System.out.printf("Bạn vừa nhập vào ngày sinh là: %s.%n", birthdate);
    }

    private static void question05() {
        System.out.println("Mời bạn nhập vào thông tin account.");
        Account account = new Account();

        System.out.println("Nhập vào id:");
        account.id = scanner.nextInt();

        System.out.println("Nhập vào email:");
        account.email = scanner.next();

        System.out.println("Nhập vào username:");
        account.username = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào full name:");
        account.fullName = scanner.nextLine();

        System.out.println("Nhập vào position:");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. Scrum Master");
        System.out.println("4. Project Manager");
        Position position = new Position();
        int ordinal = scanner.nextInt();
        position.name = PositionName.values()[ordinal - 1];
        account.position = position;

        System.out.println("Bạn vừa nhập vào account có thông tin như sau:");
        System.out.printf(
                "%d - %s - %s - %s - %s.%n",
                account.id, account.email, account.username, account.fullName, account.position.name
        );
    }

    private static void question06() {
        System.out.println("Mời bạn nhập vào thông tin department.");
        Department department = new Department();

        System.out.println("Nhập vào id:");
        department.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào name:");
        department.name = scanner.nextLine();

        System.out.println("Bạn vừa nhập vào department có thông tin như sau:");
        System.out.printf("%d - %s.%n", department.id, department.name);
    }

    private static void question07() {
        System.out.println("Mời bạn nhập vào 1 số chẵn.");

        while (true) {
            System.out.println("Nhập vào 1 số chẵn:");
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.printf("Bạn vừa nhập vào 1 số chẵn là: %d.%n", n);
                break;
            } else {
                System.out.printf("Số %d không phải là số chẵn.%n", n);
                System.out.println("Mời bạn nhập lại.");
            }
        }
    }

    private static void question08() {
        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    question05();
                    break;
                case 2:
                    question06();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
        }
    }

    private static void question09() {
        Group groupA = new Group();
        groupA.id = 1;
        groupA.name = "Database";
        groupA.createdDate = LocalDateTime.now();

        Group groupB = new Group();
        groupB.id = 2;
        groupB.name = "Java ore";
        groupB.createdDate = LocalDateTime.now();

        Group groupC = new Group();
        groupC.id = 3;
        groupC.name = "ReactJS";
        groupC.createdDate = LocalDateTime.now();

        Account accountA = new Account();
        accountA.id = 1;
        accountA.email = "khoa.nv@gmail.com";
        accountA.username = "khoa.nv";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.createdDate = LocalDateTime.now();

        Account accountB = new Account();
        accountB.id = 2;
        accountB.email = "cuong.nq@gmail.com";
        accountB.username = "cuong.nq";
        accountB.fullName = "Nguyễn Quốc Cường";
        accountB.createdDate = LocalDateTime.now();

        Account accountC = new Account();
        accountC.id = 3;
        accountC.email = "trang.nnm@gmail.com";
        accountC.username = "trang.nnm";
        accountC.fullName = "Nguyễn Ngọc Minh Trang";
        accountC.createdDate = LocalDateTime.now();

        Group[] groups = {groupA, groupB, groupC};
        Account[] accounts = {accountA, accountB, accountC};

        System.out.println("Hiển thị danh sách accounts:");
        for (Account account : accounts) {
            System.out.println("- account: " + account.username);
        }

        System.out.println("Nhập vào username:");
        String username = scanner.next();
        scanner.nextLine();

        System.out.println("Hiển thị danh sách groups:");
        for (Group group : groups) {
            System.out.println("- group: " + group.name);
        }

        System.out.println("Nhập vào group name:");
        String name = scanner.nextLine();

        for (Account account : accounts) {
            if (username.equals(account.username)) {
                for (Group group : groups) {
                    if (name.equals(group.name)) {
                        account.groups = new Group[]{group};
                        group.accounts = new Account[]{account};
                        System.out.printf("Bạn vừa thêm account %s vào group %s.%n", username, name);
                    }
                }
            }
        }
    }

    private static void question10() {
        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thêm account vào group");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    question05();
                    break;
                case 2:
                    question06();
                    break;
                case 3:
                    question09();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
        question05();
        question06();
        question07();
        question08();
        question09();
        question10();

        scanner.close();
    }
}
