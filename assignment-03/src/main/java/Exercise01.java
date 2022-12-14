import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    private static void question01() {
        System.out.println("Salary 1 = " + (int) 5240.5f);
        System.out.println("Salary 2 = " + (int) 10970.055f);
    }

    private static void question02() {
        Random random = new Random();
        // [0, 99999]
        int n = random.nextInt(100000);
        System.out.printf("=> n = %05d", n);
    }

    private static void question03() {
        Random random = new Random();
        // [0, 99999]
        int n = random.nextInt(100000);
        System.out.printf("=> n = %05d.%n", n);

        System.out.printf("=> 2 số cuối = %d.%n", n % 100);
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
