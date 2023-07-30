public class Exercise03 {
    void question01() {
        Integer salary = 5000;
        float fSalary = salary.floatValue();
        System.out.printf("Float salary = %.2f%n", fSalary);
    }

    void question02() {
        String s = "1234567";
        int n = Integer.parseInt(s);
        System.out.println("n = " + n);
    }

    void question03() {
        String s = "1234567";
        Integer integer = Integer.valueOf(s);
        int n = integer.intValue();
        System.out.println("n = " + n);
    }
}
