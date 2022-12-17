package entity;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws ShapeException {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (width + height);
    }

    @Override
    public double tinhDienTich() {
        return width * height;
    }
}
