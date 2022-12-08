package polymorphism;

// Chữ kí method: method name + danh sách tham số
public class OverloadingDemo {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
