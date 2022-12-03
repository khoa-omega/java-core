package objectmethod;

import java.util.Objects;

public class Student {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return name.equals("Khoa");
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
