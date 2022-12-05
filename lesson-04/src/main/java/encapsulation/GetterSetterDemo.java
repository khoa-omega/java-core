package encapsulation;

import encapsulation.entity.Student;

public class GetterSetterDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(-100);
        student.setName("Khoa");
        System.out.println("student = " + student);
    }
}
