import java.util.Map;

public class Number implements Expression{
    private int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return num;
    }
}
