package objectmethod;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        // Bất cứ 1 class nào đều có lớp cha là Object
        // Các method trong object: toString, equals...

        Student studentA = new Student();
        studentA.id = 1;
        studentA.name = "Hùng";
        System.out.println("studentA = " + studentA);

        Student studentB = new Student();
        studentB.id = 1;
        studentB.name = "Khoa";
        System.out.println("studentB = " + studentB);

        System.out.println("studentA.equals(studentB) = " + studentA.equals(studentB));
    }
}
