package comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    private static int count;

    public Student(String name) {
        this.id = ++count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        // Trả về số nguyên
        // > 0: Sắp xếp tăng dần
        // < 0: Sắp xếp giảm dần
        // = 0: Bằng nhau

        // Sắp xếp theo id giảm dần
        return Integer.compare(that.id, this.id);

        // Sắp xếp theo tên tăng dần
        // return this.name.compareTo(that.name);

        // Sắp xếp theo tên giảm dần
        // return that.name.compareTo(this.name);
    }
}
