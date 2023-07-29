import java.time.LocalDate;

public class Exercise02 {
    void question01() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            int n = i + 1;
            account.email = "Email " + n;
            account.username = "Username " + n;
            account.fullName = "Full name " + n;
            account.createdDate = LocalDate.now();
            accounts[i] = account;
        }
    }
}
