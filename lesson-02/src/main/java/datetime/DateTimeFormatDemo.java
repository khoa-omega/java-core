package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        // formatByCountry();
        formatByPattern();
    }

    private static void formatByPattern() {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now.format(formatter) = " + now.format(formatter));
    }

    private static void formatByCountry() {
        Locale vn = new Locale("vi", "VN");
        Locale jp = Locale.JAPAN;

        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(vn);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now.format(formatter) = " + now.format(formatter));
    }
}
