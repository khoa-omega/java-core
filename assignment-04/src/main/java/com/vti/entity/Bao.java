package com.vti.entity;

public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "maTaiLieu=" + maTaiLieu +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                ", ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
