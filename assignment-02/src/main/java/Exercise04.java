import java.time.LocalDate;
import java.util.Random;

public class Exercise04 {
    public static void question01() {
        Random random = new Random();
        System.out.println("number = " + random.nextInt());
    }

    public static void question02() {
        Random random = new Random();
        System.out.println("number = " + random.nextDouble());
    }

    public static void question03() {
        Random random = new Random();
        String[] names = {"Cường", "Hùng", "Duy", "Nam"};
        // [0, length - 1]
        int index = random.nextInt(names.length);
        System.out.printf("names[%d] = %s%n", index, names[index]);
    }

    public static void question04() {
        Random random = new Random();
        LocalDate minDate = LocalDate.of(1995, 7, 24);
        LocalDate maxDate = LocalDate.of(1995, 12, 20);
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }

    public static void question05() {
        Random random = new Random();
        LocalDate minDate = LocalDate.now().minusYears(1);
        LocalDate maxDate = LocalDate.now();
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }

    public static void question06() {
        Random random = new Random();
        LocalDate maxDate = LocalDate.now();
        int minDay = 0;
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }

    public static void question07() {
        Random random = new Random();
        int min = 100;
        int max = 999;
        int number = min + random.nextInt(max - min + 1);
        System.out.println("number = " + number);
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question05();
        question06();
        question07();
    }
}
