package entity;

public class Answer {
    int id;
    String content;
    Question question;
    boolean isCorrect;

    @Override
    public String toString() {
        return "entity.Answer{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
