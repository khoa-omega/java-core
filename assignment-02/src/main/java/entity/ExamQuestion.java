package entity;

public class ExamQuestion {
    Exam exam;
    Question question;

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "exam=" + exam.code +
                ", question=" + question.content +
                '}';
    }
}
