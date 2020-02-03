package ua.mycompany.expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.mycompany.operation.Calculation;
import ua.mycompany.operation.Operation;
import ua.mycompany.operation.OperationCalculation;

public class ComplexExpression implements Expression {
    private static final Logger LOGGER = LoggerFactory.getLogger(ComplexExpression.class);

    private Expression left;
    private Operation operation;
    private Expression right;

    public ComplexExpression(Expression left, Operation operation, Expression right) {
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("(%s %s %s)", left.toString(), operation.toString(), right.toString());
    }

    @Override
    public double evaluate(EvaluationContext context) {
        double left = this.left.evaluate(context);
        double right = this.right.evaluate(context);

        Calculation calculation = OperationCalculation.getCalculation(operation);
        LOGGER.debug("This operation " + operation + ". Of numbers: " + left + " " + right);
        return calculation.calculate(left, right);
    }
}
