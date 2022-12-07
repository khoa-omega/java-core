package backend;

import entity.TuyenSinh;

import java.util.Scanner;

public class Exercise01 {
    public static void question01() {
        Scanner scanner = new Scanner(System.in);
        MyNews myNews = new MyNews();
        while (true) {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("Chọn chức năng: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                myNews.insertNew();
            } else if (menu == 2) {
                myNews.showAllNews();
            } else if (menu == 3) {
                myNews.averageRate();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public static void question02() {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị danh sách thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát chương trình");
            System.out.println("Vui lòng chọn chức năng:");

            int menu = scanner.nextInt();
            if (menu == 1) {
                tuyenSinh.themThiSinh();
            } else if (menu == 2) {
                tuyenSinh.hienThiDSTS();
            } else if (menu == 3) {
                tuyenSinh.timKiemTheoSBD();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn lại.");
            }
        }
    }
}
