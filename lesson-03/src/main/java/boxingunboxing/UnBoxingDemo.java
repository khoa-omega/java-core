package boxingunboxing;

public class UnBoxingDemo {
    public static void main(String[] args) {
        // Wrapper Class => Primitive
        // Có 2 cách: Thủ công và tự động
        Integer number = Integer.valueOf("5");

        // Thủ công
        int number1 = number.intValue();
        int number2 = Integer.parseInt("5");

        // Auto unboxing
        int number3 = number;

        // Convert String to int
        int number4 = Integer.parseInt("5");

        System.out.println("number1 = " + number1);
        System.out.println("number4 = " + number4);
    }
}
