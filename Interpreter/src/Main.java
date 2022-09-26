/*
    요구사항
    - 후위 표기법 구현
    - 1 + 2 를 1 2 + 로 표현함
    - 후위 표기법은 스택으로 구현함
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String expression = "w x z - +";

        // 해석기 제작
        Evaluator sentence = new Evaluator(expression);

        // 사용자가 각 변수에 대한 값 입력
        Map<String, Expression> variables = new HashMap<String, Expression>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));

        // 해석기에 입력을 넣고 결과 얻기
        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}