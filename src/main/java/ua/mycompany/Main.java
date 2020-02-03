package ua.mycompany;

import ua.mycompany.expression.*;
import ua.mycompany.operation.Operation;

public class Main {

    public static void main(String[] args) {
        // expression -x + 3 * y
        Expression expression = new ComplexExpression(
                new NegationExpression(new SimpleExpression("x")),
                Operation.PLUS,
                new ComplexExpression(
                        new SimpleExpression(3.0),
                        Operation.MULT,
                        new SimpleExpression("y")
                ));
        System.out.println(expression);
        EvaluationContext context = new EvaluationContext();
        context.setVariable("x", 20);
        context.setVariable("y", 5);
        double result = expression.evaluate(context);
        System.out.println(result);
    }
}
