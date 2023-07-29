public class Exercise03 {
    public static void question01() {
        Integer salary = 5000;
        float fSalary = salary.floatValue();
        System.out.printf("Salary = %.2f%n", fSalary);
    }

    public static void question02() {
        String s = "1234567";
        int n = Integer.parseInt(s);
    }

    public static void question03() {
        String s = "1234567";
        int n = Integer.valueOf(s);
    }
}
