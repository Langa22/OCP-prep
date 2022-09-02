package lambdaExpressions;

import java.util.function.Function;

public class TestComposeAndThen {
    public static void main(String[] args) {
        //andThen() method example
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.andThen(add);

        Integer result1 = addThenMultiply.apply(3);
        System.out.println(result1);


        //compose() method example
        Function<Integer, Integer> multiply1 = (value) -> value * 2;
        Function<Integer, Integer> add1      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply1 = multiply1.andThen(add1);

        Integer result11 = addThenMultiply1.apply(3);
        System.out.println(result11);
    }
}
