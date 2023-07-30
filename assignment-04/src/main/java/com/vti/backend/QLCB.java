package com.vti.backend;

import com.vti.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themCanBo() {
        System.out.println("1. Thêm công nhân");
        System.out.println("2. Thêm kỹ sư");
        System.out.println("3. Thêm nhân viên");
        System.out.println("Chọn chức năng: ");
        int menu = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        int tuoi = scanner.nextInt();

        System.out.println("Nhập vào giới tính (1. NAM, 2. NU, 3. KHAC): ");
        GioiTinh gioiTinh = GioiTinh.values()[scanner.nextInt() - 1];

        scanner.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        String diaChi = scanner.nextLine();

        if (menu == 1) {
            System.out.println("Nhập vào bậc: ");
            int bac = scanner.nextInt();
            CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
            canBoList.add(congNhan);
        } else if (menu == 2) {
            System.out.println("Nhập vào ngành đào tạo: ");
            String nganhDaoTao = scanner.nextLine();
            KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
            canBoList.add(kySu);
        } else if (menu == 3) {
            System.out.println("Nhập vào công việc: ");
            String congViec = scanner.nextLine();
            NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
            canBoList.add(nhanVien);
        } else {
            System.out.println("Vui lòng chọn đúng chức năng.");
        }
    }

    public void timKiemTheoHoTen() {
        System.out.println("Nhập vào họ tên cần tìm: ");
        String hoTen = scanner.nextLine();
        System.out.println("Danh sách cán bộ theo họ tên: " + hoTen);
        for (CanBo canBo : canBoList) {
            if (canBo.getHoTen().equals(hoTen)) {
                System.out.println("- canBo = " + canBo);
            }
        }
    }

    public void hienThiDSCB() {
        System.out.println("Danh sách cán bộ:");
        for (CanBo canBo : canBoList) {
            System.out.println("- canBo = " + canBo);
        }
    }

    public void xoaTheoTen() {
        System.out.println("Nhập vào tên cần xóa: ");
        String ten = scanner.next();
        canBoList.removeIf(canBo -> canBo.getHoTen().contains(ten));
        System.out.println("Đã xóa tất cả cán bộ có tên: " + ten);
    }
}
