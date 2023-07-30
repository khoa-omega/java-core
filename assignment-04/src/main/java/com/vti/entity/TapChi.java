package com.vti.entity;

public class TapChi extends TaiLieu {
    private String soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTaiLieu=" + maTaiLieu +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                ", soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
