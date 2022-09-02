package lambdaExpressions;

import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;

public class Question32 {
    public static void main(String[] args) {
        LongFunction<LongUnaryOperator> func = a -> b -> b - a; //Line n1
        System.out.println(calc(func.apply(100), 50)); //Line n2
    }

    private static long calc(LongUnaryOperator op, long val) {
        return op.applyAsLong(val);
    }

}
