package entity;

public class CategoryQuestion {
    int id;
    String name;
    Question[] questions;

    @Override
    public String toString() {
        return "entity.CategoryQuestion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
