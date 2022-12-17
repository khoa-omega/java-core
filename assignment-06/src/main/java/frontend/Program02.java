package frontend;

import backend.Exercise02;
import utils.ScannerUtils;

public class Program02 {
    public static void main(String[] args) {
//        Exercise02.question09();
        Exercise02.question11_12();

//        try {
//            float result = divide(7, 0);
//
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("Can not divide 0.");
//        } finally {
//            System.out.println("Divide completed!");
//        }
//
//        try {
//            int[] numbers = {1, 2, 3};
//            System.out.println(numbers[10]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//
//        getIndex(100);
//
//        System.out.println("Nhập vào tuổi:");
//        int age = ScannerUtils.inputAge();
//        System.out.println("age = " + age);
    }

    public static void getIndex(int index) {
        try {
            String[] departments = {"Kỹ thuật", "Giám đốc", "Nhân sự"};
            System.out.println(departments[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can not find department.");
        }
    }

    public static float divide(int a, int b) {
        return a / b;
    }
}
