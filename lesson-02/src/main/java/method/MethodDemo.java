package method;

public class MethodDemo {

    // Cú pháp

    // [Phạm vi truy cập] [static] <Kiểu dữ liệu> <Tên phương thức>(<Kiểu dữ liệu> <Tên tham số>, ...) {
    //     Khối lệnh
    // }

    // void: Không trả về dữ liệu
    // return: Trả về dữ liệu

    public static void main(String[] args) {
        // question01();
        int c = sum(10, 100);
        System.out.println("c = " + c);
    }

    public static void question01() {
        System.out.println("Question 01");
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
