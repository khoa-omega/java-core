package flowcontrol;

public class IfElseDemo {
    public static void main(String[] args) {
        int age = 18;
        if (age > 18) {
            System.out.println("Bạn đã trên 18 tuổi.");
        } else if (age < 18) {
            System.out.println("Bạn chưa đủ 18 tuổi.");
        } else {
            System.out.println("Bạn 18 tuổi.");
        }

        if (age >= 18) {
            System.out.println("Bạn đã trên 18 tuổi.");
        } else {
            System.out.println("Bạn chưa đủ 18 tuổi.");
        }

        // Ternary
        String message = (age >= 18) ? "Bạn đã trên 18 tuổi." : "Bạn chưa đủ 18 tuổi.";
        System.out.println(message);
    }
}
