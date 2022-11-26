public class CategoryQuestion {
    int id;
    String name;
    Question[] questions;

    @Override
    public String toString() {
        return "CategoryQuestion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
