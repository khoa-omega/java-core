package exception;

import java.io.IOException;

public class DepartmentNotExistException extends IOException {
    public DepartmentNotExistException() {
        super();
    }

    public DepartmentNotExistException(String message) {
        super(message);
    }
}
