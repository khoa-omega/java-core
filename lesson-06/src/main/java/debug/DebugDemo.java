package debug;

public class DebugDemo {
    public static void main(String[] args) {
        System.out.println("Trước khi lặp.");
        loop();
        System.out.println("Sau khi lặp.");
    }

    public static void loop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Dòng thứ " + (i + 1));
        }
    }
}
