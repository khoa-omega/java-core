public class Department {
    int id;
    String name;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object instanceof Department) {
            Department that = (Department) object;
            return name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
