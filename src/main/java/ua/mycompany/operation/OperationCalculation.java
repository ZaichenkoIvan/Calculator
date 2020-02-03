package ua.mycompany.operation;

import java.util.HashMap;
import java.util.Map;

public final class OperationCalculation {
    private static Map<Operation, Calculation> operationToCalculations = new HashMap<>();

    static {
        operationToCalculations.put(Operation.DIVIDE, (x, y) -> x / y);
        operationToCalculations.put(Operation.PLUS, (x, y) -> x + y);
        operationToCalculations.put(Operation.MINUS, (x, y) -> x - y);
        operationToCalculations.put(Operation.MULT, (x, y) -> x * y);
    }

    public OperationCalculation() {
    }

    public static Calculation getCalculation(Operation operation) {
        return operationToCalculations.get(operation);
    }
}
