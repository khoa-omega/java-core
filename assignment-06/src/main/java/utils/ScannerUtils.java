package utils;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputAge() {
        while (true) {
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong inputing! Please input an age as int, input again.");
            }
        }
    }

    public static int inputPositiveInt(String errorMessage) {
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                if (n > 0) {
                    return n;
                } else {
                    System.out.println(errorMessage);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static float inputFloat(String errorMessage) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static double inputDouble(String errorMessage) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String inputString(String errorMessage) {
        while (true) {
            String text = scanner.nextLine().trim();
            if (text.isEmpty()) {
                System.out.println(errorMessage);
            } else {
                return text.replaceAll("\\s+", " ");
            }
        }
    }
}
