package entity;

public abstract class Shape {
    public static int count;

    public Shape() throws ShapeException {
        if (count >= Configs.SO_LUONG_HINH_TOI_DA) {
            throw new ShapeException("Số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
        }
        ++count;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
