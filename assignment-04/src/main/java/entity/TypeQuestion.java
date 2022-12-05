package entity;

public class TypeQuestion {
    int id;
    TypeName name;
    Question[] questions;

    @Override
    public String toString() {
        return "entity.TypeQuestion{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
