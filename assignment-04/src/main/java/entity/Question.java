package entity;

import java.time.LocalDateTime;

public class Question {
    int id;
    String content;
    CategoryQuestion category;
    TypeQuestion type;
    Account creator;
    LocalDateTime createdDate;
    Answer[] answers;

    @Override
    public String toString() {
        return "entity.Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
