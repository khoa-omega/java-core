package string;

public class StringDemo {
    public static void main(String[] args) {
        // String vừa là primitive vừa là object

        // Primitive
        String s1 = "Java core";

        // Object
        String s2 = new String("Java core");

        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        // ==: So sánh theo địa chỉ ô nhớ
        // equals: So sánh theo nội dung

        System.out.println("s1 == \"Java core\" = " + (s1 == "Java core"));
        System.out.println("s2 == \"Java core\" = " + (s2 == "Java core"));

        // Nếu có object tham gia vào phép so sánh
        // => Sử dụng equals
    }
}
