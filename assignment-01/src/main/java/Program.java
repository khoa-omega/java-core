import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";
        System.out.println("Tên phòng ban: " + department.name);

        Position position = new Position();
        position.id = 1;
        position.name = PositionName.DEV;
        System.out.println("Tên chức vụ: " + position.name);

        Account account = new Account();
        account.id = 1;
        account.email = "khoa.nv@gmail.com";
        account.username = "khoa.nv";
        account.fullName = "Nguyễn Văn Khoa";
        account.department = department;
        account.position = position;
        account.createdDate = LocalDate.now();
        System.out.println("Tên nhân viên: " + account.fullName);

        Group group = new Group();
        group.id = 1;
        group.name = "Java Core";
        group.creator = account;
        group.createdDate = LocalDate.of(2023, 7, 28);
        System.out.println("Tên nhóm: " + group.name);

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.group = group;
        groupAccount.account = account;
        groupAccount.joinedDate = LocalDate.of(2023, 7, 29);
        System.out.println("Nhân viên: " + groupAccount.account.username + " đã tham gia nhóm: " + groupAccount.group.name);
        System.out.println("Ngày tham gia nhóm: " + groupAccount.joinedDate);

        TypeQuestion type = new TypeQuestion();
        type.id = 1;
        type.name = TypeName.MULTIPLE_CHOICE;
        System.out.println("Loại câu hỏi: " + type.name);

        CategoryQuestion category = new CategoryQuestion();
        category.id = 1;
        category.name = "Java";
        System.out.println("Danh mục câu hỏi: " + category.name);

        Question question = new Question();
        question.id = 1;
        question.content = "Kiểu dữ liệu nguyên thủy có mấy loại?";
        question.category = category;
        question.type = type;
        question.creator = account;
        question.createdDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi: " + question.content);

        Answer answer = new Answer();
        answer.id = 1;
        answer.content = "Có 8 loại: boolean, char, byte, short, int, long, float, double";
        answer.question = question;
        answer.isCorrect = true;
        System.out.println("Nội dung câu trả lời: " + answer.content);

        Exam exam = new Exam();
        exam.id = 1;
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.category = category;
        exam.duration = 180;
        exam.creator = account;
        exam.createdDate = LocalDate.now();
        System.out.println("Tên đề thi: " + exam.title);

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.exam = exam;
        examQuestion.question = question;
        System.out.println("Mã đề thi: " + examQuestion.exam.code + " có câu hỏi: " + examQuestion.question.content);
    }
}
