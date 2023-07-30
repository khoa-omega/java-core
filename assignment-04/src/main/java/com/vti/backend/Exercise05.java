package com.vti.backend;

import com.vti.entity.HighSchoolStudent;

import java.util.Scanner;

public class Exercise05 {
    public void question02() {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("1. Thêm mới cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị thông tin về danh sách các cán bộ.");
            System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");
            System.out.println("5. Thoát khỏi chương trình.");
            System.out.println("Chọn chức năng: ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                qlcb.themCanBo();
            } else if (menu == 2) {
                qlcb.timKiemTheoHoTen();
            } else if (menu == 3) {
                qlcb.hienThiDSCB();
            } else if (menu == 4) {
                qlcb.xoaTheoTen();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public void question03() {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học công nghệ");
        System.out.println(highSchoolStudent);
    }

    public void question04() {
        Scanner scanner = new Scanner(System.in);
        QLTV qltv = new QLTV();
        while (true) {
            System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo");
            System.out.println("2. Xoá tài liệu theo mã tài liệu.");
            System.out.println("3. Hiện thị thông tin về tài liệu.");
            System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
            System.out.println("5. Thoát khỏi chương trình");
            System.out.println("Chọn chức năng bạn muốn dùng: ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                qltv.themTaiLieu();
            } else if (menu == 2) {
                qltv.xoaTaiLieuTheoId();
            } else if (menu == 3) {
                qltv.hienThiDSTL();
            } else if (menu == 4) {
                qltv.timKiemTaiLieuTheoLoai();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }
}
