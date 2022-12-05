package entity;

import java.time.LocalDateTime;

public class Exam {
    int id;
    String code;
    String title;
    CategoryQuestion category;
    int duration;
    Account creator;
    LocalDateTime createdDate;
    Question[] questions;

    @Override
    public String toString() {
        return "entity.Exam{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", createdDate=" + createdDate +
                '}';
    }
}
