public class Exercise01 {
    void question01() {
        Department department = new Department();
        department.name = "Giám đốc";

        Account account = new Account();
        account.department = department;

        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account.department.name);
        }
    }

    void question02() {
        Group[] groups = {new Group(), new Group()};
        Account account = new Account();
        account.groups = groups;

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

    void question03() {
        Department department = new Department();
        department.name = "Giám đốc";

        Account account = new Account();
        account.department = department;

        String message = (account.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account.department.name;
        System.out.println(message);
    }

    void question04() {
        Position position = new Position();
        position.name = PositionName.DEV;

        Account account = new Account();
        account.position = position;

        String message = (account.position.name == PositionName.DEV)
                ? "Đây là developer"
                : "Người này không phải là developer";
        System.out.println(message);
    }

    void question05() {
        Account[] accounts = {new Account(), new Account()};
        Group group = new Group();
        group.accounts = accounts;

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

    void question06() {
        Group[] groups = {new Group(), new Group()};
        Account account = new Account();
        account.groups = groups;

        switch (account.groups.length) {
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

    void question07() {
        Position position = new Position();
        position.name = PositionName.DEV;

        Account account = new Account();
        account.position = position;

        switch (account.position.name) {
            case DEV:
                System.out.println("Đây là developer");
                break;
            default:
                System.out.println("Người này không phải là developer");
                break;
        }
    }

    void question08() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        for (Account account : accounts) {
            System.out.println("- Email: " + account.email);
            System.out.println("- Họ và tên: " + account.fullName);
            System.out.println("- Tên phòng ban: " + account.department.name);
        }
    }

    void question09() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        for (Department department : departments) {
            System.out.println("- Mã phòng ban: " + department.id);
            System.out.println("- Tên phòng ban: " + department.name);
        }
    }

    void question10() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            System.out.println();
        }
    }

    void question11() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("    Id: " + departments[i].id);
            System.out.println("    Name: " + departments[i].name);
            System.out.println();
        }
    }

    void question12() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("    Id: " + departments[i].id);
            System.out.println("    Name: " + departments[i].name);
            System.out.println();
        }
    }

    void question13() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

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

    void question14() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

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

    void question15() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    void question16() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        int i = 0;
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            System.out.println();
            i++;
        }
    }

    void question17() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        int i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("    Id: " + departments[i].id);
            System.out.println("    Name: " + departments[i].name);
            System.out.println();
            i++;
        }
    }

    void question18() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        int i = 0;
        while (i < 2) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("    Id: " + departments[i].id);
            System.out.println("    Name: " + departments[i].name);
            System.out.println();
            i++;
        }
    }

    void question19() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        int i = 0;
        while (i < accounts.length) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
            i++;
        }
    }

    void question20() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        int i = 0;
        while (i < accounts.length) {
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
            i++;
        }
    }

    void question21() {
        int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }

    void question22() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        int i = 0;
        do {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            System.out.println();
            i++;
        } while (i < accounts.length);
    }

    void question23() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        int i = 0;
        do {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("    Id: " + departments[i].id);
            System.out.println("    Name: " + departments[i].name);
            System.out.println();
            i++;
        } while (i < departments.length);
    }

    void question24() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        int i = 0;
        do {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("    Id: " + departments[i].id);
            System.out.println("    Name: " + departments[i].name);
            System.out.println();
            i++;
        } while (i < 2);
    }

    void question25() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        int i = 0;
        do {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
            i++;
        } while (i < accounts.length);
    }

    void question26() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.department = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.department = departmentB;

        Account[] accounts = {accountA, accountB};

        int i = 0;
        do {
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
            i++;
        } while (i < accounts.length);
    }

    void question27() {
        int i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);
    }
}
