package com.vti.entity;

public abstract class Student3 extends Person {
    protected int id;

    public Student3(int id, String name) {
        super(name);
        this.id = id;
    }
}
