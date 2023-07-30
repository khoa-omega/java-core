package com.vti.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    protected final List<Contact> contacts = new ArrayList<>();

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
}
