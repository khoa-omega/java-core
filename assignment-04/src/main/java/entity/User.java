package entity;

import java.util.Scanner;

public abstract class User {
    protected String name;
    protected double salaryRatio;

    public User() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào user.");

        System.out.println("Nhập vào name:");
        this.name = scanner.next();

        System.out.println("Nhập vào salary ratio:");
        this.salaryRatio = scanner.nextDouble();
    }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + calculatePay() +
                '}';
    }
}
