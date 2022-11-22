public class Exercise01 {
    public static void question01() {
        Account account = new Account();
        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là ...");
        }
    }

    public static void question03() {
        Account account = new Account();
        String message = (account.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là ...";
        System.out.println(message);
    }

    public static void question05() {
        Group group = new Group();
        group.accounts = new Account[] {new Account(), new Account()};
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

    public static void main(String[] args) {
        // question01();
        // question03();
        question05();
    }
}
