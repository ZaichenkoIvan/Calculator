package ua.mycompany.exception;

public class VariableNotExistRuntimeException extends RuntimeException {
    public VariableNotExistRuntimeException() {
    }

    public VariableNotExistRuntimeException(String message) {
        super(message);
    }

    public VariableNotExistRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
