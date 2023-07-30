package com.vti.entity;

public class Atm {
    private String id;
    private String name;
    private int balance;

    public Atm(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public void transferTo(Atm that, int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            that.balance += amount;
        }
    }
}
