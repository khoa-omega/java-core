package flowcontrol;

public class BreakDemo {
    public static void main(String[] args) {
        // Break: Dừng vòng lặp

        for (int i = 0; i < 10; i++) {
            System.out.println("Đang tìm kiếm vị trí thứ: " + i);
            if (i == 5) {
                System.out.println("Đã tìm thấy");
                break;
            }
        }
        System.out.println("Dưới vòng lặp");
    }
}
