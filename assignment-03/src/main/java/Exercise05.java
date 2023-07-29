import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise05 {
    void question01() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        System.out.println("Department = " + department);
    }

    void question02() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";
        Department[] departments = {departmentA};

        for (Department department : departments) {
            System.out.println("Department = " + department);
        }
    }

    void question03() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        System.out.println("Hash code = " + department.hashCode());
    }

    void question04() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        boolean answer = department.name.equals("Phòng A");
        System.out.println("Answer = " + answer);
    }

    void question05() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";

        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Giám đốc";

        boolean answer = departmentA.equals(departmentB);
        System.out.println("Answer = " + answer);
    }

    void question06() {
        List<String> departments = Arrays.asList(
                "Sale",
                "Waiting room",
                "Boss of director",
                "Marketing",
                "Accounting"
        );
        departments.sort(Comparator.naturalOrder());
        for (String department : departments) {
            System.out.println("Department = " + department);
        }
    }

    void question07() {
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
            System.out.println("Department = " + department);
        }
    }
}
