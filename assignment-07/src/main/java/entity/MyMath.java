package entity;

public class MyMath {
    public static final double PI = 3.14;

    public double sum(int a) {
//        PI = 3.15;
        return a + PI;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
