package entity;

public class HinhChuNhat {
    protected int width;
    protected int height;

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int tinhChuVi() {
        return 2 * (width + height);
    }

    public int tinhDienTich() {
        return width * height;
    }
}
