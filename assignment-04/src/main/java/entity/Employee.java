package entity;

public class Employee extends User {
    @Override
    public double calculatePay() {
        return salaryRatio * 420;
    }
}
