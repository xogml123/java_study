package week1_1.opeartor;

public class ZeroDivisionException extends RuntimeException{

    public ZeroDivisionException() {
        super();
    }

    public ZeroDivisionException(String message) {
        super(message);
    }

    public ZeroDivisionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroDivisionException(Throwable cause) {
        super(cause);
    }
}
