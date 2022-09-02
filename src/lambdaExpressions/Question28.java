package lambdaExpressions;

import java.util.function.BiFunction;

public class Question28 {
    public static void main(String[] args) {
        BiFunction<String, String, String> func = (s1, s2) -> s2.concat(s1).trim();
        System.out.println(func.apply(" CD", " AB"));
    }
}
