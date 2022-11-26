package flowcontrol;

public class ContinueDemo {
    public static void main(String[] args) {
        // Continue: Lặp tức lặp tiếp với giá trị tiếp theo
        // => Khối lệnh phía sau continue sẽ không được chạy

        System.out.println("Bắt đầu tìm kiếm.");
        for (int i = 0; i < 10; i++) {
            if (i <= 5) {
                continue;
            }
            System.out.println("Đang tìm kiếm: " + i);
        }
        System.out.println("Kết thúc tìm kiếm.");
    }
}
