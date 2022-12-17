package entity;

public class InvalidAgeInputtingException extends RuntimeException {
    public InvalidAgeInputtingException() {
        super();
    }

    public InvalidAgeInputtingException(String message) {
        super(message);
    }
}
