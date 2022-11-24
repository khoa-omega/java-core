public class Exercise01 {
    public static void question01() {
        Account account = new Account();
        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là ...");
        }
    }

    public static void question02() {
        Account account = new Account();
        if (account.groups == null || account.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account.groups.length == 1 || account.groups.length == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    public static void question03() {
        Account account = new Account();
        String message = (account.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là ...";
        System.out.println(message);
    }

    public static void question04() {
        Account account = new Account();
        Position position = new Position();
        position.name = PositionName.DEV;
        account.position = position;
        String message = (account.position.name == PositionName.DEV)
                ? "Đây là Developer"
                : "Người này không phải là Developer";
        System.out.println(message);
    }

    public static void question05() {
        Group group = new Group();
        group.accounts = new Account[]{new Account(), new Account()};
        switch (group.accounts.length) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }

    public static void question06() {
        Account account = new Account();
        account.groups = new Group[]{new Group()};
        if (account.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int length = account.groups.length;
            switch (length) {
                case 0:
                    System.out.println("Nhân viên này chưa có group");
                    break;
                case 1:
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }
    }

    public static void question07() {
        Account account = new Account();
        Position position = new Position();
        position.name = PositionName.DEV;
        account.position = position;

        switch (account.position.name) {
            case DEV:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    }

    public static void question08() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account};

        for (Account acc : accounts) {
            System.out.println("acc.email = " + acc.email);
            System.out.println("acc.fullName = " + acc.fullName);
            System.out.println("acc.department.name = " + acc.department.name);
        }
    }

    public static void question09() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        Department[] departments = {department};

        for (Department dep : departments) {
            System.out.println("dep.id = " + dep.id);
            System.out.println("dep.name = " + dep.name);
        }
    }

    public static void question10() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account};

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            System.out.println();
        }
    }

    public static void question11() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        Department[] departments = {department};

        for (int i = 0; i < departments.length; i++) {

        }
    }

    public static void question12() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        Department[] departments = {department};

        for (int i = 0; i < 2; i++) {

        }
    }

    public static void question13() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account, account};

        for (int i = 0; i < accounts.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
        }
    }

    public static void question14() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account, account};

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
        }
    }

    public static void question15() {
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // question01();
        // question02();
        // question03();
        // question04();
        // question05();
        // question06();
        // question07();
        // question08();
        // question09();
        // question10();
        // question13();
        // question14();
        question15();
    }
}
