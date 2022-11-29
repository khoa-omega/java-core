package object;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive => Wrapper Class
        // byte      => Byte
        // short     => Short
        // int       => Integer
        // long      => Long
        // float     => Float
        // double    => Double
        // char      => Character

        // Wrapper Class chiếm nhiều bộ nhớ hơn Primitive
        // Lý do cần Wrapper Class
        // 1. Cung cấp các phương thức
        // 2. Lưu trữ các thông tin hữu ích
        // 3. Có thể chứa giá trị NULL

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        int number = 5;
        Integer iNumber = new Integer(5);

        System.out.println("number = " + number);
        System.out.println("iNumber = " + iNumber);
    }
}
