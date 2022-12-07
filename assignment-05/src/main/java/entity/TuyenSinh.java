package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private Scanner scanner = new Scanner(System.in);
    private List<ThiSinh> thiSinhList = new ArrayList<>();

    @Override
    public void themThiSinh() {
        System.out.println("Mời bạn nhập vào thí sinh.");

        System.out.println("Nhập vào số báo danh:");
        String soBaoDanh = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào họ tên:");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập vào địa chỉ:");
        String diaChi = scanner.nextLine();

        System.out.println("Nhập vào mức ưu tiên:");
        int mucUuTien = scanner.nextInt();

        System.out.println("Nhập vào khối thi:");
        char khoiThi = scanner.next().charAt(0);

        ThiSinh thiSinh = new ThiSinh(soBaoDanh, hoTen, diaChi, mucUuTien, khoiThi);
        thiSinhList.add(thiSinh);
    }

    @Override
    public void hienThiDSTS() {
        for (ThiSinh thiSinh : thiSinhList) {
            System.out.println("♥💪 thiSinh = " + thiSinh);
        }
    }

    @Override
    public void timKiemTheoSBD() {
        System.out.println("Nhập vào số báo danh cần tìm:");
        String soBaoDanh = scanner.next();

        for (ThiSinh thiSinh : thiSinhList) {
            if (thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
                System.out.println("♥💪 thiSinh = " + thiSinh);
            }
        }
    }
}
