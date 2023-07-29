import java.time.LocalDate;
import java.util.Random;

public class Exercise04 {
    void question01() {
        Random random = new Random();
        int n = random.nextInt();
        System.out.println("n = " + n);
    }

    void question02() {
        Random random = new Random();
        double n = random.nextDouble();
        System.out.println("n = " + n);
    }

    void question03() {
        Random random = new Random();
        String[] names = {"Khoa", "Trang", "Duy", "Hùng"};
        int index = random.nextInt(names.length);
        System.out.printf("names[%d] = %s%n", index, names[index]);
    }

    void question04() {
        Random random = new Random();
        LocalDate minDate = LocalDate.of(1995, 7, 24);
        LocalDate maxDate = LocalDate.of(1995, 12, 20);
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random date: " + randomDate);
    }

    void question05() {
        Random random = new Random();
        LocalDate minDate = LocalDate.now().minusYears(1);
        LocalDate maxDate = LocalDate.now();
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random date: " + randomDate);
    }

    void question06() {
        Random random = new Random();
        LocalDate maxDate = LocalDate.now();
        int minDay = 0;
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random date: " + randomDate);
    }

    void question07() {
        Random random = new Random();
        int min = 100;
        int max = 999;
        int n = min + random.nextInt(max - min + 1);
        System.out.println("n = " + n);
    }
}
