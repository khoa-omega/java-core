package exception;

// Throws: Cảnh báo rằng phương thức này có thể xảy ra exception như khai báo
// Đề nghị thằng gọi nó cần xử lý exception đó

// Những exceptions trong nhánh RuntimeException không bắt buộc phải xử lý
// Còn lại thì phải xử lý
public class ThrowsDemo {
    public static void main(String[] args) throws IllegalAccessException {
//        try {
//            goToJapan(15);
//        } catch (IllegalAccessException e) {
//            System.out.println(e.getMessage());
//        }

        goToJapan(15);
    }

    public static void goToJapan(int age) throws IllegalAccessException {
        if (age >= 18) {
            System.out.println("Going to Japan...");
        } else {
            throw new IllegalAccessException("Bạn chưa đủ 18 tuổi.");
        }
    }
}
