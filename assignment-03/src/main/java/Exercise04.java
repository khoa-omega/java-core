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

        String capitalizedName = name.substring(0, 1).toUpperCase()
                + name.substring(1);

        System.out.printf("=> %s.", capitalizedName);
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
        String fullName = scanner.nextLine();

        String a = fullName.trim();
        System.out.println("=> Câu a: " + a);

        String[] words = a.split("\\s+");
        String b = "";
        for (String word : words) {
            b += word.substring(0, 1).toUpperCase()
                    + word.substring(1) + " ";
        }
        System.out.println("=> Câu b: " + b);
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
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 != length2) {
            System.out.println("KO");
            return;
        }
        for (int i = 0; i < length1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length1 - 1 - i);
            if (c1 != c2) {
                System.out.println("KO");
                return;
            }
        }
        System.out.println("OK");
    }

    void question11(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == c ? 1 : 0;
        }
        System.out.printf("=> %d lần xuất hiện.%n", count);
    }

    void question12(String s) {
        int length = s.length();
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        System.out.printf("=> Chuỗi đảo ngược là: %s.%n", reversed);
    }

    void question13(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
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

    static void question15(String s) {
        String[] words = s.trim().split("\\s+");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println("=> Reverse String by word: " + reversed);
    }

    void question16(String s, int n) {
        if (s.length() % n != 0) {
            System.out.println("=> KO.");
        }
    }
}
