import java.time.LocalDateTime;

public class Question {
    int id;
    String content;
    CategoryQuestion category;
    TypeQuestion type;
    Account creator;
    LocalDateTime createdDate;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
