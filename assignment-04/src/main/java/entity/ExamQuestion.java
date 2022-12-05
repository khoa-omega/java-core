package entity;

public class ExamQuestion {
    Exam exam;
    Question question;

    @Override
    public String toString() {
        return "entity.ExamQuestion{" +
                "exam=" + exam.code +
                ", question=" + question.content +
                '}';
    }
}
