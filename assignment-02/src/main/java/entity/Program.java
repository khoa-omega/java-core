package entity;

public class Program {
    public static void main(String[] args) {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";
        System.out.println("departmentA = " + departmentA);

        Position positionA = new Position();
        positionA.id = 1;
        positionA.name = PositionName.DEV;
        System.out.println("positionA = " + positionA);
    }
}
