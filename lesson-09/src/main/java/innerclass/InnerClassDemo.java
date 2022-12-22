package innerclass;

public class InnerClassDemo {
    public static void main(String[] args) {
        // Inner class là một class bình thường
        // 1. Nằm trong class khác
        // 2. Có thể truy cập vào thuộc tính hoặc phương thức của outer class
        // 3. Có thể khai báo static class

        // Non-static inner class
        // OuterClass outer = new OuterClass();
        // OuterClass.InnerClass inner = outer.new InnerClass();
        // inner.showInfo();

        // Static inner class
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.showInfo();
    }
}
