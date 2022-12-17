package statics;

public class MyMath {
    public static final double PI = 3.14159;

    public int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }
}
