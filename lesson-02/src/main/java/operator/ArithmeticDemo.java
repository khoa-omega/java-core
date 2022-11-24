package operator;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int x = 1050;
        int y = 100;

        System.out.println("(x + y) = " + (x + y));
        System.out.println("(x - y) = " + (x - y));
        System.out.println("(x * y) = " + (x * y));
        System.out.println("(x / y) = " + (x / y));
        System.out.println("(x % y) = " + (x % y));

        // x = x + 50; ~ x += 50;
        // x = x - 50; ~ x -= 50;
        // x = x * 50; ~ x *= 50;
        // x = x / 50; ~ x /= 50;
        // x = x % 50; ~ x %= 50;

        // <Tên biến>++: Gán trước, cộng sau
        // int z = x++ + y;
        // ~
        // int z = x + y;
        // x = x + 1;

        // ++<Tên biến>: Cộng trước, gán sau
        // int z = ++x + y;
        // ~
        // x = x + 1;
        // int z = x + y;
    }
}
