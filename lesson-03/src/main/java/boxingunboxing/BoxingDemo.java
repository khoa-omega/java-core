package boxingunboxing;

public class BoxingDemo {
    public static void main(String[] args) {
        // Primitive => Wrapper Class
        // Có 2 cách: Thủ công và tự động

        // Thủ công
        Integer number1 = new Integer(5);
        Integer number2 = Integer.valueOf(5);

        // Auto boxing
        // Chỉ được khi primitive và wrapper class là một cặp
        Integer number3 = 5;

        // Convert String to Integer
        Integer number4 = new Integer("5");
        Integer number5 = Integer.valueOf("5");

        System.out.println("number1 = " + (number1 + 6));
        System.out.println("number5 = " + (number5 + 6));
    }
}
