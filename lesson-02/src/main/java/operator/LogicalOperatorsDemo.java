package operator;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        // &&, ||, !

        // &&: TRUE khi cả 2 đều TRUE
        System.out.println("(1 < 2 && 2 < 3) = " + (1 < 2 && 2 < 3));

        // ||: FALSE khi cả 2 đều FALSE
        System.out.println("(1 < 2 || 2 < 1) = " + (1 < 2 || 2 < 1));

        // !: Đảo ngược logic, TRUE khi FALSE và FALSE khi TRUE
        System.out.println("!true = " + !true);
    }
}
