package flowcontrol;

public class ContinueDemo {
    public static void main(String[] args) {
        // Continue: Bỏ qua, vấn tiếp tục vòng lặp

        for (int i = 0; i < 10; i++) {
            if (i <= 5) {
                continue;
            }
            System.out.println("Đang tìm kiếm: " + i);
        }
    }
}
