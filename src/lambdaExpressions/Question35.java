package lambdaExpressions;

import java.util.function.UnaryOperator;

public class Question35 {
    public static void main(String[] args) {
        final String password = "Oracle";
        UnaryOperator<String> opr1 = s -> s.replace('a', '@'); //Line n1
        UnaryOperator<String> opr2 = s -> password.concat(s); //Line n2
        System.out.println("Password: " + opr1.apply(opr2.apply("!"))); //Line n3
    }
}
