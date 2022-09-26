import java.util.Map;

public class Plus implements Expression{
    // + 의 왼쪽에 올 표현
    Expression leftOperand;
    // + 의 오른쪽에 올 표현
    Expression rightOperand;

    public Plus(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
