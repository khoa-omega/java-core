import java.time.LocalDate;
import java.time.LocalDateTime;
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
        String formattedDate = formatter.format(exam.createdDate);

        System.out.println("Mã đề thi: " + exam.code);
        System.out.println("Tên đề thi: " + exam.title);
        System.out.println("Thời gian thi: " + exam.duration + " phút");
        System.out.println("Ngày tạo đề thi: " + formattedDate);
    }

    void question02() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();
        LocalDateTime createdDate = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy - MM - dd - HH - mm - ss");
        String formattedDate = formatter.format(createdDate);

        System.out.println("Mã đề thi: " + exam.code);
        System.out.println("Tên đề thi: " + exam.title);
        System.out.println("Thời gian thi: " + exam.duration + " phút");
        System.out.println("Ngày tạo đề thi: " + formattedDate);
    }

    void question03() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String formattedDate = formatter.format(exam.createdDate);

        System.out.println("Mã đề thi: " + exam.code);
        System.out.println("Tên đề thi: " + exam.title);
        System.out.println("Thời gian thi: " + exam.duration + " phút");
        System.out.println("Ngày tạo đề thi: " + formattedDate);
    }

    void question04() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM - yyyy");
        String formattedDate = formatter.format(exam.createdDate);

        System.out.println("Mã đề thi: " + exam.code);
        System.out.println("Tên đề thi: " + exam.title);
        System.out.println("Thời gian thi: " + exam.duration + " phút");
        System.out.println("Ngày tạo đề thi: " + formattedDate);
    }

    void question05() {
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createdDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM - dd");
        String formattedDate = formatter.format(exam.createdDate);

        System.out.println("Mã đề thi: " + exam.code);
        System.out.println("Tên đề thi: " + exam.title);
        System.out.println("Thời gian thi: " + exam.duration + " phút");
        System.out.println("Ngày tạo đề thi: " + formattedDate);
    }
}
