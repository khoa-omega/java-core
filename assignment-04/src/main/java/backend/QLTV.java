package backend;

import entity.Book;
import entity.Document;
import entity.Magazine;
import entity.NewsPaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTV {
    Scanner scanner = new Scanner(System.in);
    List<Document> documents = new ArrayList<>();

    public void timKiemTaiLieuTheoLoai() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Nhập vào loại tài liệu: ");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                for (Document document : documents) {
                    if (document instanceof Book) {
                        System.out.println("book = " + document);
                    }
                }
                break;
            case 2:
                for (Document document : documents) {
                    if (document instanceof Magazine) {
                        System.out.println("magazine = " + document);
                    }
                }
                break;
            default:
                for (Document document : documents) {
                    if (document instanceof NewsPaper) {
                        System.out.println("newsPaper = " + document);
                    }
                }
                break;
        }
    }

    public void hienThiDSTL() {
        System.out.println("documents = " + documents);
    }

    public void xoaTaiLieuTheoId() {
        System.out.println("Nhập vào mã tài liệu cần xóa: ");
        int id = scanner.nextInt();
        documents.removeIf(document -> document.getId() == id);
    }

    public void themTaiLieu() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Nhập vào loại tài liệu: ");
        int menu = scanner.nextInt();

        System.out.println("Nhập vào mã tài liệu: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào nhà xuất bản: ");
        scanner.nextLine();
        String nxb = scanner.nextLine();
        System.out.println("Nhập vào số bản phát hành: ");
        int releaseNumber = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Nhập vào tên tác giả: ");
                scanner.nextLine();
                String authorName = scanner.nextLine();
                System.out.println("Nhập vào số trang: ");
                int pageNumbers = scanner.nextInt();
                Document book = new Book(id, nxb, releaseNumber, authorName, pageNumbers);
                documents.add(book);
                break;
            case 2:
                System.out.println("Nhập vào số phát hành: ");
                scanner.nextLine();
                String soPhatHanh = scanner.nextLine();
                System.out.println("Nhập vào tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();
                Document magazine = new Magazine(id, nxb, releaseNumber, soPhatHanh, thangPhatHanh);
                documents.add(magazine);
                break;
            case 3:
                System.out.println("Nhập vào ngày phát hành: ");
                int ngayPhatHanh = scanner.nextInt();
                Document newsPaper = new NewsPaper(id, nxb, releaseNumber, ngayPhatHanh);
                documents.add(newsPaper);
                break;
        }
    }
}
