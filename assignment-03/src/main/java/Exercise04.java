import com.sun.xml.internal.ws.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.text.WordUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    private static final Scanner scanner = new Scanner(System.in);

    private static void question01() {
        System.out.println("Mời bạn nhập vào 1 xâu kí tự.");

        System.out.println("Nhập vào 1 xâu kí tự:");
        String s = scanner.nextLine();

        int count = s.trim().split("\\s+").length;
        System.out.printf("=> Có %d từ.%n", count);
    }

    private static void question02() {
        System.out.println("Mời bạn nhập vào 2 xâu kí tự.");

        System.out.println("Nhập vào xâu kí tự thứ 1:");
        String s1 = scanner.nextLine();

        System.out.println("Nhập vào xâu kí tự thứ 2:");
        String s2 = scanner.nextLine();

        String s = s1.concat(s2);
        System.out.printf("=> %s.%n", s);
    }

    private static void question03() {
        System.out.println("Mời bạn nhập vào tên.");

        System.out.println("Nhập vào tên:");
        String name = scanner.next();

        System.out.printf("=> %s.", StringUtils.capitalize(name));
    }

    private static void question04() {
        System.out.println("Mời bạn nhập vào tên.");

        System.out.println("Nhập vào tên:");
        String name = scanner.next();

        for (int i = 0; i < name.length(); i++) {
            System.out.printf("Kí tự thứ %d là: %C.%n", i + 1, name.charAt(i));
        }
    }

    private static void question05() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ:");
        String lastName = scanner.nextLine();

        System.out.println("Nhập vào tên:");
        String firstName = scanner.next();

        System.out.printf("=> %s %s.", lastName, firstName);
    }

    private static void question06() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        String[] words = fullName.trim().split("\\s+");
        System.out.printf("Họ là: %s.%n", words[0]);
        System.out.printf("Tên đệm là: %s.%n", String.join(" ", Arrays.copyOfRange(words, 1, words.length - 1)));
        System.out.printf("Tên là: %s.%n", words[words.length - 1]);
    }

    private static void question07() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        String s = WordUtils.capitalizeFully(fullName.trim().replaceAll("\\s+", " "));
        System.out.printf("=> Chuẩn hóa: %s.%n", s);
    }

    private static void question08() {
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            if (group.contains("Java")) {
                System.out.printf("=> group = %s.%n", group);
            }
        }
    }

    private static void question09() {
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            if (group.equals("Java")) {
                System.out.printf("=> group = %s.%n", group);
            }
        }
    }

    private static void question10(String s1, String s2) {
        String s = new StringBuilder(s2).reverse().toString();
        System.out.printf("=> %s.%n", s.equals(s1) ? "OK" : "KO");
    }

    private static void question11(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == c ? 1 : 0;
        }
        System.out.printf("=> %d lần xuất hiện.%n", count);
    }

    private static void question12(String s) {
        System.out.printf("=> Chuỗi đảo ngược là: %s.%n", new StringBuilder(s).reverse());
    }

    private static void question13(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.println("=> FALSE.");
                return;
            }
        }
        System.out.println("=> TRUE.");
    }

    private static void question14(String s, char oldChar, char newChar) {
        System.out.printf("=> Replaced String: %s.%n", s.replace(oldChar, newChar));
    }

    private static void question15(String s) {
        String[] words = s.trim().split("\\s+");
        ArrayUtils.reverse(words);
        System.out.printf("=> Reverse String by word: %s.%n", String.join(" ", words));
    }

    private static void question16(String s, int n) {
        if (s.length() % n != 0) {
            System.out.println("=> KO.");
        }
    }

    public static void main(String[] args) {


        scanner.close();
    }
}
