package flowcontrol;

public class BreakDemo {
    public static void main(String[] args) {
        // Break: Lặp tức thoát ra khỏi vòng lặp

        System.out.println("Bắt đầu tìm kiếm.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Đang tìm kiếm vị trí thứ: " + i);
            if (i == 5) {
                System.out.println("Đã tìm thấy.");
                break;
            }
        }
        System.out.println("Kết thúc tìm kiếm.");
    }
}
