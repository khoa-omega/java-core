package entity;

import java.time.LocalDateTime;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDateTime createdDate;
    Account[] accounts;

    public Group() {
    }

    public Group(String name, Account creator, LocalDateTime createdDate, Account[] accounts) {
        this.name = name;
        this.creator = creator;
        this.createdDate = createdDate;
        this.accounts = accounts;
    }

    public Group(String name, Account creator, LocalDateTime createdDate, String[] usernames) {
        this.name = name;
        this.creator = creator;
        this.createdDate = createdDate;
        // Convert String[] to entity.Account[]
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account account = new Account();
            account.username = usernames[i];
            accounts[i] = account;
        }
    }

    @Override
    public String toString() {
        return "entity.Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
