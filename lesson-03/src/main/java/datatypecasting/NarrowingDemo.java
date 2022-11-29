package datatypecasting;

public class NarrowingDemo {
    public static void main(String[] args) {
        // Kiểu số: byte (1), short (2), int (4), long (8), float (4), double (8)
        // Narrowing: Thu hẹp một kiểu dữ liệu
        // double -> float -> long -> int -> short -> byte
        // Chú ý: Có thể tràn số, thận trọng khi sử dụng

        int iNumber = 10;
        byte bNumber = (byte) iNumber;
        System.out.println("bNumber = " + bNumber);

        long lDanSo = 8000000000L;
        int iDanSo = (int) lDanSo;
        System.out.println("iDanSo = " + iDanSo);

        // Ví dụ 2:
        // Trong một phép toán, kiểu dữ liệu trả về là kiểu lớn nhất
        int a = 1;
        int b = 2;
        System.out.println("(a / b) = " + ((float) a / b));
    }
}
