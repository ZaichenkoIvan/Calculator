package ua.mycompany.expression;

public class NegationExpression implements Expression {
    private Expression innerExpression;

    public NegationExpression(Expression innerExpression) {
        this.innerExpression = innerExpression;
    }

    @Override
    public String toString() {
        return String.format("(-%s)", innerExpression.toString());
    }

    @Override
    public double evaluate(EvaluationContext context) {
        return -innerExpression.evaluate(context);
    }
}
