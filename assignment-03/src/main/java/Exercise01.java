import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    private static void question01() {
        System.out.println("Salary 1 = " + (int) 5240.5f);
        System.out.println("Salary 2 = " + (int) 10970.055f);
    }

    private static int question02() {
        return 10000 + new Random().nextInt(90000);
    }

    private static void question03() {
        System.out.println("Hai số cuối = " + question02() % 100);
    }

    private static double question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số nguyên a và b.");

        System.out.println("Nhập vào số nguyên a:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số nguyên b:");
        int b = scanner.nextInt();

        return (double) a / b;
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
    }
}
