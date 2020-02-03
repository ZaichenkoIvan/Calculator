package ua.mycompany.operation;

public enum Operation {
    DIVIDE('/'),
    MINUS('-'),
    MULT('*'),
    PLUS('+');
    private char sign;

    Operation(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return Character.toString(sign);
    }
}
