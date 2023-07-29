import com.sun.xml.internal.ws.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.text.WordUtils;

import java.util.Scanner;

public class Exercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 xâu kí tự.");

        System.out.println("Nhập vào 1 xâu kí tự:");
        String s = scanner.nextLine();

        int count = s.trim().split("\\s+").length;
        System.out.printf("=> Có %d từ.%n", count);
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 xâu kí tự.");

        System.out.println("Nhập vào xâu kí tự thứ 1:");
        String s1 = scanner.nextLine();

        System.out.println("Nhập vào xâu kí tự thứ 2:");
        String s2 = scanner.nextLine();

        String s = s1.concat(s2);
        System.out.printf("=> %s.%n", s);
    }

    void question03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên.");

        System.out.println("Nhập vào tên:");
        String name = scanner.next();

        System.out.printf("=> %s.", StringUtils.capitalize(name));
    }

    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên.");

        System.out.println("Nhập vào tên:");
        String name = scanner.next();

        int length = name.length();
        for (int i = 0; i < length; i++) {
            int n = i + 1;
            char c = name.charAt(i);
            System.out.printf("Kí tự thứ %d là: %C.%n", n, c);
        }
    }

    void question05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ:");
        String firstName = scanner.nextLine();

        System.out.println("Nhập vào tên:");
        String lastName = scanner.next();

        System.out.printf("=> %s %s.", firstName, lastName);
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine()
                .trim().replaceAll("\\s+", " ");

        int firstIndexOfSpace = fullName.indexOf(' ');
        int lastIndexOfSpace = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(0, firstIndexOfSpace);
        String middleName = fullName.substring(firstIndexOfSpace + 1, lastIndexOfSpace);
        String lastName = fullName.substring(lastIndexOfSpace + 1);
        System.out.printf("Họ là: %s.%n", firstName);
        System.out.printf("Tên đệm là: %s.%n", middleName);
        System.out.printf("Tên là: %s.%n", lastName);
    }

    void question07() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine()
                .trim().replaceAll("\\s+", " ");

        String s = WordUtils.capitalizeFully(fullName);
        System.out.printf("=> Chuẩn hóa: %s.%n", s);
    }

    void question08() {
        String[] groups = {"Database", "Java", "Java Core", "Java Advanced", "ReactJS"};
        for (String group : groups) {
            if (group.contains("Java")) {
                System.out.printf("=> Group = %s.%n", group);
            }
        }
    }

    void question09() {
        String[] groups = {"Database", "Java", "Java Core", "Java Advanced", "ReactJS"};
        for (String group : groups) {
            if (group.equals("Java")) {
                System.out.printf("=> Group = %s.%n", group);
            }
        }
    }

    void question10(String s1, String s2) {
        String s = new StringBuilder(s2).reverse().toString();
        System.out.printf("=> %s.%n", s.equals(s1) ? "OK" : "KO");
    }

    void question11(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == c ? 1 : 0;
        }
        System.out.printf("=> %d lần xuất hiện.%n", count);
    }

    void question12(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.printf("=> Chuỗi đảo ngược là: %s.%n", reversed);
    }

    void question13(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.println("=> FALSE.");
                return;
            }
        }
        System.out.println("=> TRUE.");
    }

    void question14(String s, char oldChar, char newChar) {
        String replaced = s.replace(oldChar, newChar);
        System.out.printf("=> Replaced String: %s.%n", replaced);
    }

    void question15(String s) {
        String[] words = s.trim().split("\\s+");
        ArrayUtils.reverse(words);
        String reversed = String.join(" ", words);
        System.out.printf("=> Reverse String by word: %s.%n", reversed);
    }

    void question16(String s, int n) {
        if (s.length() % n != 0) {
            System.out.println("=> KO.");
        }
    }
}
