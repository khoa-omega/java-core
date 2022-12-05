package backend;

import java.util.Scanner;

public class Exercise05 {
    public static void question02() {
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
}
