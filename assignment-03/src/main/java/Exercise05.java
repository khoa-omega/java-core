import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise05 {
    private static void question01() {
        Department department = new Department("Giám đốc");
        System.out.println("department = " + department);
    }

    private static void question02() {
        Department[] departments = {new Department("Giám đốc")};
        for (Department department : departments) {
            System.out.println("department = " + department);
        }
    }

    private static void question03() {
        Department department = new Department("Giám đốc");
        System.out.println("department.hashCode() = " + department.hashCode());
    }

    private static void question04() {
        Department department = new Department("Phòng A");
        boolean answer = department.name.equals("Phòng A");
        System.out.println("answer = " + answer);
    }

    private static void question05() {
        Department departmentA = new Department("Phòng A");
        Department departmentB = new Department("Phòng B");
        boolean answer = departmentA.equals(departmentB);
        System.out.println("answer = " + answer);
    }

    private static void question06() {
        List<String> departments = Arrays.asList(
                "Sale",
                "Waiting room",
                "Boss of director",
                "Marketing",
                "Accounting"
        );
        departments.sort(Comparator.naturalOrder());
        for (String department : departments) {
            System.out.println("department = " + department);
        }
    }

    private static void question07() {
        List<String> departments = Arrays.asList(
                "Sale",
                "Waiting room",
                "Boss of director",
                "Marketing",
                "Accounting"
        );
        departments.sort((o1, o2) -> {
            String lastWord1 = o1.substring(o1.lastIndexOf(" ") + 1);
            String lastWord2 = o2.substring(o2.lastIndexOf(" ") + 1);
            return lastWord1.compareToIgnoreCase(lastWord2);
        });
        for (String department : departments) {
            System.out.println("department = " + department);
        }
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
        question05();
        question06();
        question07();
    }
}
