package i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getInstance(locale);
        String result = formatter.format(8000000000.5);
        System.out.println("result = " + result);
    }
}
