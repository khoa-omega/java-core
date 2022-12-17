package entity;

public class Student {
    protected final int id;
    protected String name;

    public static int count;
    public static int moneyGroup;
    private static String college;

    public Student(String name) {
        if (count >= 7) {
            // Nếu đã tạo đủ 7 học sinh => không cho phép tạo nữa
            throw new IllegalStateException("Chỉ được tạo được tối đa 7 học sinh.");
        }
        this.id = ++count;
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public final void study() {
        System.out.println("Đang học bài...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
