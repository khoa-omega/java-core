package com.vti.entity;

public class Department {
    int id;
    String name;
    Account[] accounts;

    public Department() {
    }

    public Department(String name) {
        this.id = 0;
        this.name = name;
    }
}
