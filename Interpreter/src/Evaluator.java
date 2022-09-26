import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression{
    private Expression syntax; // 최종 해석

    public Evaluator(String expression) {
        Stack<Expression> stack = new Stack<Expression>();

        for (String strToken : expression.split(" ")) {
            if (strToken.equals("+")) {
                Expression expressionPlus = new Plus(stack.pop(), stack.pop());
                stack.push(expressionPlus);
            } else if (strToken.equals("-")) {
                Expression expressionMinus = new Minus(stack.pop(), stack.pop());
                stack.push(expressionMinus);
            } else {
                stack.push(new Variable(strToken));
            }
        }
        syntax = stack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntax.interpret(variables);
    }
}
