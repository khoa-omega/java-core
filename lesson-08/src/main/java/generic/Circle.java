package generic;

public class Circle<T extends Number> {
    private T radius;
    private String name;

    public Circle(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
