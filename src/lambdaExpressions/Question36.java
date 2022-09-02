package lambdaExpressions;

import java.util.function.UnaryOperator;

public class Question36 {
    public static void main(String[] args) {
        UnaryOperator<String> opr = s -> s.toString().toUpperCase(); //Line n1
        //System.out.println(opr.apply(new StringBuilder("Hello"))); //Line n2
    }
}
