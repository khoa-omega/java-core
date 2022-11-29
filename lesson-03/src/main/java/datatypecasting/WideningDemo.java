package datatypecasting;

public class WideningDemo {
    public static void main(String[] args) {
        // Kiểu số: byte (1), short (2), int (4), long (8), float (4), double (8)
        // Widening: Nới rộng một kiểu dữ liệu
        // byte -> short -> int -> long -> float -> double
        int iNumber = 10;
        long lNumber = iNumber;
        System.out.println("lNumber = " + lNumber);
    }
}
