package entity;

public class Student {
    private int id;
    private String name;

    private static int count;

    public Student(String name) {
        this.id = ++count;
        this.name = name;
    }

    /**
     * @deprecated Replaced by {@link #getIdV2()}
     */
    @Deprecated
    public int getId() {
        return id;
    }

    public String getIdV2() {
        return "MSV: " + id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
