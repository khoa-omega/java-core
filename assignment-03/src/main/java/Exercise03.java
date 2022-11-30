public class Exercise03 {
    public static void question01() {
        Integer salary = 5000;
        System.out.printf("Salary = %.2f%n", salary.floatValue());
    }

    public static void question02() {
        int n = Integer.parseInt("1234567");
    }

    public static void question03() {
        int n = Integer.valueOf("1234567");
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
    }
}
