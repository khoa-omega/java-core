package com.vti.backend;

import com.vti.entity.Sach;
import com.vti.entity.TaiLieu;
import com.vti.entity.TapChi;
import com.vti.entity.Bao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTV {
    private Scanner scanner = new Scanner(System.in);
    private List<TaiLieu> taiLieuList = new ArrayList<>();

    public void timKiemTaiLieuTheoLoai() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Nhập vào loại tài liệu: ");
        int menu = scanner.nextInt();
        if (menu == 1) {
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof Sach) {
                    System.out.println(taiLieu);
                }
            }
        } else if (menu == 2) {
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof TapChi) {
                    System.out.println(taiLieu);
                }
            }
        } else {
            for (TaiLieu taiLieu : taiLieuList) {
                if (taiLieu instanceof Bao) {
                    System.out.println(taiLieu);
                }
            }
        }
    }

    public void hienThiDSTL() {
        System.out.println("Danh sách tài liệu:");
        for (TaiLieu taiLieu : taiLieuList) {
            System.out.println("- document = " + taiLieu);
        }
    }

    public void xoaTaiLieuTheoId() {
        System.out.println("Nhập vào mã tài liệu cần xóa: ");
        int id = scanner.nextInt();
        taiLieuList.removeIf(taiLieu -> taiLieu.getMaTaiLieu() == id);
    }

    public void themTaiLieu() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Nhập vào loại tài liệu: ");
        int menu = scanner.nextInt();

        System.out.println("Nhập vào mã tài liệu: ");
        int maTaiLieu = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào nhà xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();

        System.out.println("Nhập vào số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Nhập vào tên tác giả: ");
                scanner.nextLine();
                String tenTacGia = scanner.nextLine();
                System.out.println("Nhập vào số trang: ");
                int soTrang = scanner.nextInt();
                TaiLieu book = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                taiLieuList.add(book);
                break;
            case 2:
                System.out.println("Nhập vào số phát hành: ");
                scanner.nextLine();
                String soPhatHanh = scanner.nextLine();
                System.out.println("Nhập vào tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();
                TaiLieu magazine = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                taiLieuList.add(magazine);
                break;
            case 3:
                System.out.println("Nhập vào ngày phát hành: ");
                int ngayPhatHanh = scanner.nextInt();
                TaiLieu newsPaper = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
                taiLieuList.add(newsPaper);
                break;
        }
    }
}
