import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Exercise03 {
    void question01() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        Locale vn = new Locale("vi", "VN");
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(vn);

        System.out.println("Mã đề thi: " + exam.code);
        System.out.println("Tên đề thi: " + exam.title);
        System.out.println("Thời gian thi: " + exam.duration + " phút");
        System.out.println("Ngày tạo đề thi: " + formatter.format(exam.createdDate));
    }

    void question02() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy - MM - dd - HH - mm - ss");

        System.out.println("Ngày tạo đề thi: " + formatter.format(exam.createdDate));
    }

    void question03() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy");

        System.out.println("Ngày tạo đề thi: " + formatter.format(exam.createdDate));
    }

    void question04() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("MM - yyyy");

        System.out.println("Ngày tạo đề thi: " + formatter.format(exam.createdDate));
    }

    void question05() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("MM - dd");

        System.out.println("Ngày tạo đề thi: " + formatter.format(exam.createdDate));
    }
}
