package backend;

import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

import java.util.Arrays;

public class Exercise01 {
    public static void question01() {
        Student studentA = new Student("Nguyễn Văn A");
        Student studentB = new Student("Nguyễn Văn B");
        Student studentC = new Student("Nguyễn Văn C");

        Student.setCollege("Đại học bách khoa");

        for (Student student : Arrays.asList(studentA, studentB, studentC)) {
            System.out.println("student = " + student);
        }

        Student.setCollege("Đại học công nghệ");

        for (Student student : Arrays.asList(studentA, studentB, studentC)) {
            System.out.println("student = " + student);
        }
    }

    public static void question02() {
        Student studentA = new Student("Nguyễn Văn A");
        Student studentB = new Student("Nguyễn Văn B");
        Student studentC = new Student("Nguyễn Văn C");
        Student[] students = {studentA, studentB, studentC};
        Student.setCollege("Đại học bách khoa");

        System.out.println("Tiền quỹ hiện tại = " + Student.moneyGroup);

        for (Student student : students) {
            student.moneyGroup += 100;
        }

        System.out.println("Tiền quỹ hiện tại = " + Student.moneyGroup);

        studentA.moneyGroup -= 50;
        System.out.println("Tiền quỹ hiện tại = " + Student.moneyGroup);

        studentB.moneyGroup -= 20;
        System.out.println("Tiền quỹ hiện tại = " + Student.moneyGroup);

        studentC.moneyGroup -= 150;
        System.out.println("Tiền quỹ hiện tại = " + Student.moneyGroup);

        for (Student student : students) {
            student.moneyGroup += 50;
        }
        System.out.println("Tiền quỹ hiện tại = " + Student.moneyGroup);
    }

    public static void question03() {
        int min = MyMath.min(5, 7);
        System.out.println("min = " + min);

        int sum = MyMath.sum(5, 7);
        System.out.println("sum = " + sum);
    }

    public static void question05() {
        Student studentA = new Student("Nguyễn Văn A");
        Student studentB = new Student("Nguyễn Văn B");
        Student studentC = new Student("Nguyễn Văn C");

        System.out.println("Số học sinh được tạo là: " + Student.count);
    }

    public static void question06() {
        Student studentA = new PrimaryStudent("Nguyễn Văn A");
        Student studentB = new PrimaryStudent("Nguyễn Văn B");
        Student studentC = new SecondaryStudent("Nguyễn Văn C");
        Student studentD = new SecondaryStudent("Nguyễn Văn D");
        Student studentE = new SecondaryStudent("Nguyễn Văn E");
        Student studentF = new SecondaryStudent("Nguyễn Văn F");

        System.out.println("Student.count = " + Student.count);
        System.out.println("PrimaryStudent.count = " + PrimaryStudent.count);
        System.out.println("SecondaryStudent.count = " + SecondaryStudent.count);
    }
}
