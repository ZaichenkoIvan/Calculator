package ua.mycompany.expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.mycompany.exception.EmptySimpleExpressionRuntimeException;

public class SimpleExpression implements Expression {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleExpression.class);
    public static final String SIMPLE_EXPRESSION_IS_EMPTY = "Simple expression is empty";

    private String name;
    private Double value;

    public SimpleExpression(String name) {
        this.name = name;
    }

    public SimpleExpression(Double value) {
        this.value = value;
    }

    public boolean isConstant() {
        return value !=null;
    }

    @Override
    public String toString() {
        if (name != null) {
            return name;
        }

        if (value != null) {
            return value.toString();
        }

        LOGGER.warn(SIMPLE_EXPRESSION_IS_EMPTY);
        throw new EmptySimpleExpressionRuntimeException(SIMPLE_EXPRESSION_IS_EMPTY);
    }

    @Override
    public double evaluate(EvaluationContext context) {
        if (isConstant()) {
            return value;
        }

        return context.getVariable(name);
    }
}
