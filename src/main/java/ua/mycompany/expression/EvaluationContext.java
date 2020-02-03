package ua.mycompany.expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.mycompany.exception.VariableNotExistRuntimeException;

import java.util.HashMap;
import java.util.Map;

public class EvaluationContext {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleExpression.class);
    private static final String EVALUATION_ERROR = "evaluation error: variable %s does not exist in the current context";

    private final Map<String, Double> variables = new HashMap<>();

    public void setVariable(String name, double value) {
        variables.put(name, value);
    }

    public double getVariable(String name) {
        if (!variables.containsKey(name)) {
            LOGGER.warn(String.format(EVALUATION_ERROR, name));
            throw new VariableNotExistRuntimeException
                    (String.format(EVALUATION_ERROR, name));
        }

        return variables.get(name);
    }
}
