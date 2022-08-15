package lambdaExpressions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer>function=n->n*n;
        System.out.println(function.apply(5));
        Function<String,Integer>f=s -> s.length();
        System.out.println(f.apply("Sivenathi"));
    }
}
