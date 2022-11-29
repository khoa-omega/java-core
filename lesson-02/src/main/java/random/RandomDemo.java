package random;

import java.time.LocalDate;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // [Integer.MIN_VALUE, Integer.MAX_VALUE]
        int a = random.nextInt();
        System.out.println("a = " + a);

        // [0, 100)
        int b = random.nextInt(100);
        System.out.println("b = " + b);

        // Chú ý: random.nextInt(max) => [0, max)
        // [0, max]: random.nextInt(max + 1)
        // [min, max]: min + random.nextInt(max - min + 1)
        int min = 10;
        int max = 100;
        int c = min + random.nextInt(max - min + 1);
        System.out.println("c = " + c);

        // Random date
        // 0 ------------- 1000 ------ 2000 ---------> (date)
        // 0 ------------- 50000 ------- 100000 -----> (day)
        // => Random day = 75000
        // => Convert day to date = 1500
        LocalDate minDate = LocalDate.of(1975, 4, 30);
        LocalDate maxDate = LocalDate.now();
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }
}
