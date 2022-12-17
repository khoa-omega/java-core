package entity;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws ShapeException {
        super();
        this.radius = radius;
    }

    @Override
    public double tinhChuVi() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return radius * radius * Math.PI;
    }
}
