package entity;

public class Position {
    int id;
    PositionName name;
    Account[] accounts;

    @Override
    public String toString() {
        return "entity.Position{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
