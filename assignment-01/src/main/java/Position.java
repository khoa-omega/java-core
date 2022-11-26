public class Position {
    int id;
    PositionName name;
    Account[] accounts;

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
