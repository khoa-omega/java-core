package backend;

import entity.HinhChuNhat;
import entity.HinhVuong;
import entity.Student;

public class Exercise02 {
    public static void question02() {
        Student student = new Student();
        student.inputInfo();
        student.showInfo();
        System.out.println("student.datDuocHocBong() = " + student.datDuocHocBong());
    }

    public static void question03() {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(1, 2);
        System.out.println("hinhChuNhat.tinhChuVi() = " + hinhChuNhat.tinhChuVi());
        System.out.println("hinhChuNhat.tinhDienTich() = " + hinhChuNhat.tinhDienTich());

        HinhVuong hinhVuong = new HinhVuong(1);
        System.out.println("hinhVuong.tinhChuVi() = " + hinhVuong.tinhChuVi());
        System.out.println("hinhVuong.tinhDienTich() = " + hinhVuong.tinhDienTich());
    }
}
