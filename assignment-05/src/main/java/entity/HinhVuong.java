package entity;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(int width) {
        super(width, width);
    }

    @Override
    public int tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        return super.tinhChuVi();
    }

    @Override
    public int tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        return super.tinhDienTich();
    }
}
