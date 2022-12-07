package entity;

public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;
    private char khoiThi;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien, char khoiThi) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
        this.khoiThi = khoiThi;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public String getKhoiThi() {
        if (khoiThi == 'A') {
            return "Toán, Lý, Hóa";
        }
        if (khoiThi == 'B') {
            return "";
        }
        return "khoiThi";
    }

    public void setKhoiThi(char khoiThi) {
        this.khoiThi = khoiThi;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                ", khoiThi=" + getKhoiThi() +
                '}';
    }
}
