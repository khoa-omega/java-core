import java.util.Locale;

public class Exercise02 {
    public static void question01() {
        int number = 5;
        System.out.printf("number = %d%n", number);
    }

    public static void question02() {
        int number = 100000000;
        System.out.printf(Locale.ENGLISH, "number = %,d%n", number);
    }

    public static void question03() {
        double number = 5.567098;
        System.out.printf("number = %.4f%n", number);
    }

    public static void question04() {
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", fullName);
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
    }
}
