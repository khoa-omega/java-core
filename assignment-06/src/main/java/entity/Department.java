package entity;

import utils.ScannerUtils;

public class Department {
    private int id;
    private String name;

    public Department() {
        System.out.println("Mời bạn nhập vào department.");

        System.out.println("Nhập vào id: ");
        this.id = ScannerUtils.inputPositiveInt("Nhập lại");

        System.out.println("Nhập vào name: ");
        this.name = ScannerUtils.inputString("Nhập lại");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
