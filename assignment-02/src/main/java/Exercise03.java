import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Exercise03 {
    public static void question01() {
        Exam exam = new Exam();
        exam.title = "Java core";
        exam.createdDate = LocalDateTime.now();

        System.out.println("exam.title = " + exam.title);
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(new Locale("vi"));
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question02() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy - MM - dd - HH - mm - ss");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question03() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question04() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question05() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-DD");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
        question05();
    }
}
