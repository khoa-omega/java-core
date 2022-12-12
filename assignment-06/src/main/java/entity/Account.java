package entity;

import utils.ScannerUtils;

import java.util.Scanner;

public class Account {
    private int id;
    private int age;

    public Account() {
        System.out.println("Mời bạn nhập vào account.");

        System.out.println("Nhập vào account id: ");
        this.id = ScannerUtils.inputPositiveInt("Nhập lại");

        System.out.println("Nhập vào age: ");
        this.age = ScannerUtils.inputAge();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    private int inputAge() throws InvalidAgeInputtingException {
//        ScannerUtils scannerUtils = new ScannerUtils();
//        int age = scannerUtils.inputInt("Nhập lại");
//        if (age > 0) {
//            return age;
//        }
//        throw new InvalidAgeInputtingException("The age must be greater than 0");
//    }
//
//    private int inputAccountAge() {
//        while (true) {
//            try {
//                int age = inputAge();
//                if (age < 18) {
//                    System.out.println("Your age must be greater than 18");
//                } else {
//                    return age;
//                }
//            } catch (InvalidAgeInputtingException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
