package ua.mycompany.exception;

public class EmptySimpleExpressionRuntimeException extends RuntimeException {
    public EmptySimpleExpressionRuntimeException() {
    }

    public EmptySimpleExpressionRuntimeException(String message) {
        super(message);
    }

    public EmptySimpleExpressionRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
