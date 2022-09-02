package lambdaExpressions;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

public class Question31 {
    public static void main(String[] args) {
        DoubleFunction<DoubleUnaryOperator> func = m -> n -> m + n; //Line n1
        System.out.println(func.apply(11).applyAsDouble(24)); //Line n2
    }
}
