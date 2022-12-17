package exception;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (DepartmentNotExistException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwException() throws DepartmentNotExistException {
        throw new DepartmentNotExistException("Phòng ban không tồn tại");
    }
}
