package entity;

public class Manager extends User {
    @Override
    public double calculatePay() {
        return salaryRatio * 520;
    }
}
