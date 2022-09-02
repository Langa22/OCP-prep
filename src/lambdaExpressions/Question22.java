package lambdaExpressions;

import java.util.function.BiFunction;

public class Question22 {
    public static void main(String[] args) {
        BiFunction<Double, Double, Integer> compFunc = Double::compareTo;
        System.out.println(compFunc.apply(10.01, 11.99));
    }
}
