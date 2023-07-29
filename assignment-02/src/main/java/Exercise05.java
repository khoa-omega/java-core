import java.time.LocalDate;
import java.util.Scanner;

public class Exercise05 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 3 số nguyên.");

        System.out.println("Nhập vào số thứ 1:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số thứ 2:");
        int b = scanner.nextInt();

        System.out.println("Nhập vào số thứ 3:");
        int c = scanner.nextInt();

        System.out.printf("Bạn vừa nhập vào 3 số nguyên: %d, %d và %d.%n", a, b, c);
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số thực.");

        System.out.println("Nhập vào số thứ 1:");
        double a = scanner.nextDouble();

        System.out.println("Nhập vào số thứ 2:");
        double b = scanner.nextDouble();

        System.out.printf("Bạn vừa nhập vào 2 số thực: %f và %f.%n", a, b);
    }

    void question03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        System.out.printf("Bạn vừa nhập vào họ và tên: %s.%n", fullName);
    }

    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào ngày sinh.");

        System.out.println("Nhập vào ngày sinh (yyyy-MM-dd):");
        LocalDate birthdate = LocalDate.parse(scanner.next());

        System.out.printf("Bạn vừa nhập vào ngày sinh: %s.%n", birthdate);
    }

    void question05() {
        Scanner scanner = new Scanner(System.in);
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
                "Account[%d, %s, %s, %s, %s].%n",
                account.id, account.email, account.username,
                account.fullName, account.position.name
        );
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin department.");
        Department department = new Department();

        System.out.println("Nhập vào id:");
        department.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào name:");
        department.name = scanner.nextLine();

        System.out.println("Bạn vừa nhập vào department có thông tin như sau:");
        System.out.printf("Department[%d, %s].%n", department.id, department.name);
    }

    void question07() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số chẵn.");

        while (true) {
            System.out.println("Nhập vào 1 số chẵn:");
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.printf("Bạn vừa nhập vào số chẵn: %d.%n", n);
                break;
            } else {
                System.out.printf("Số %d không phải là số chẵn.%n", n);
                System.out.println("Mời bạn nhập lại.");
            }
        }
    }

    void question08() {
        Scanner scanner = new Scanner(System.in);
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
            }
        }
    }

    void question09() {
        Scanner scanner = new Scanner(System.in);

        Group groupA = new Group();
        groupA.id = 1;
        groupA.name = "Database";
        groupA.createdDate = LocalDate.now();

        Group groupB = new Group();
        groupB.id = 2;
        groupB.name = "Java Core";
        groupB.createdDate = LocalDate.now();

        Group groupC = new Group();
        groupC.id = 3;
        groupC.name = "ReactJS";
        groupC.createdDate = LocalDate.now();

        Account accountA = new Account();
        accountA.id = 1;
        accountA.email = "khoa.nv@gmail.com";
        accountA.username = "khoa.nv";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.createdDate = LocalDate.now();

        Account accountB = new Account();
        accountB.id = 2;
        accountB.email = "cuong.nq@gmail.com";
        accountB.username = "cuong.nq";
        accountB.fullName = "Nguyễn Quốc Cường";
        accountB.createdDate = LocalDate.now();

        Account accountC = new Account();
        accountC.id = 3;
        accountC.email = "trang.nnm@gmail.com";
        accountC.username = "trang.nnm";
        accountC.fullName = "Nguyễn Ngọc Minh Trang";
        accountC.createdDate = LocalDate.now();

        Group[] groups = {groupA, groupB, groupC};
        Account[] accounts = {accountA, accountB, accountC};

        System.out.println("Danh sách account:");
        for (Account account : accounts) {
            System.out.println("- username: " + account.username);
        }

        System.out.println("Nhập vào username:");
        String username = scanner.nextLine();

        System.out.println("Danh sách group:");
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
                        System.out.printf(
                                "Bạn vừa thêm account %s vào group %s.%n",
                                username, name
                        );
                    }
                }
            }
        }
    }

    void question10() {
        Scanner scanner = new Scanner(System.in);
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
            }
        }
    }
}
