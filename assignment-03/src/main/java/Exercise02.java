import java.time.LocalDateTime;

public class Exercise02 {
    private static void question01() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = String.format("Email %d", i + 1);
            account.username = String.format("Username %d", i + 1);
            account.fullName = String.format("Full name %d", i + 1);
            account.createdDate = LocalDateTime.now();
            accounts[i] = account;
        }
    }

    public static void main(String[] args) {
        question01();
    }
}
