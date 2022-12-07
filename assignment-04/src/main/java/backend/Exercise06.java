package backend;

import entity.Employee;
import entity.Phone;
import entity.VietnamesePhone;

import java.util.Scanner;

public class Exercise06 {
    public static void question1() {
        Scanner scanner = new Scanner(System.in);
        Phone vietnamesePhone = new VietnamesePhone();
        while (true) {
            System.out.println("1. insertContact");
            System.out.println("2. removeContact");
            System.out.println("3. updateContact");
            System.out.println("4. searchContact");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            int menu = scanner.nextInt();
            if (menu == 5) return;

            System.out.println("Nhập vào tên: ");
            String name = scanner.next();

            switch (menu) {
                case 1:
                    System.out.println("Nhập vào phone: ");
                    String phone = scanner.next();
                    vietnamesePhone.insertContact(name, phone);
                    break;
                case 2:
                    vietnamesePhone.removeContact(name);
                    break;
                case 3:
                    System.out.println("Nhập vào new phone: ");
                    String newPhone = scanner.next();
                    vietnamesePhone.updateContact(name, newPhone);
                    break;
                case 4:
                    vietnamesePhone.searchContact(name);
                    break;
            }
        }
    }

    public static void question02_03() {
        Employee employee = new Employee();
        employee.displayInfo();
    }
}
