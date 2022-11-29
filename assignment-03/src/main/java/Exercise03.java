public class Exercise03 {
    public static void question01() {
        Integer salary = 5000;
        float fSalary = salary.floatValue();
        System.out.printf("salary = %.2f %n", fSalary);
    }

    public static void question02() {
        String s = "1234567";
        int number = Integer.parseInt(s);
        System.out.println("number = " + number);
    }

    public static void question03() {
        Integer number = new Integer("1234567");
        int num = number;
        System.out.println("num = " + num);
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
    }
}
