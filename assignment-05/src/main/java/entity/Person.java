package entity;

import java.util.Scanner;

public class Person {
    protected String ten;
    protected GioiTinh gioiTinh;
    protected String ngaySinh;
    protected String diaChi;

    public Person() {
    }

    public Person(String ten, GioiTinh gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin person.");

        System.out.println("Nhập vào tên:");
        this.ten = scanner.next();

        System.out.println("Nhập vào giới tính (1. Nam, 2. Nữ):");
        this.gioiTinh = GioiTinh.values()[scanner.nextInt() - 1];

        System.out.println("Nhập vào ngày sinh:");
        this.ngaySinh = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào địa chỉ:");
        this.diaChi = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println(this);
    }
}
