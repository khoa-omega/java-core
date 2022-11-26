package operator;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // =, +=, -=, *=, /=, %/

        int a = 50;
        a += 50;
        System.out.println("a = " + a);

        // a = 5;       <=>  a = 5;
        // a = a + 50;  <=>  a += 50;
        // a = a - 50;  <=>  a -= 50;
        // a = a * 50;  <=>  a *= 50;
        // a = a / 50;  <=>  a /= 50;
        // a = a % 50;  <=>  a %= 50;
    }
}
