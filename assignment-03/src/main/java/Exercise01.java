import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    void question01() {
        float salary1;
        float salary2;
        salary1 = 5240.5f;
        salary2 = 10970.055f;
        int roundedSalary1 = (int) salary1;
        int roundedSalary2 = (int) salary2;
        System.out.println("Rounded salary 1 = " + roundedSalary1);
        System.out.println("Rounded salary 2 = " + roundedSalary2);
    }

    void question02() {
        Random random = new Random();
        int n = random.nextInt(100000);
        System.out.printf("=> n = %05d.%n", n);
    }

    void question03() {
        Random random = new Random();
        int n = random.nextInt(100000);
        System.out.printf("=> n = %05d.%n", n);
        System.out.printf("=> 2 số cuối = %d.%n", n % 100);
    }

    double question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số nguyên a và b.");

        System.out.println("Nhập vào số nguyên a:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số nguyên b:");
        int b = scanner.nextInt();

        return (double) a / b;
    }
}
