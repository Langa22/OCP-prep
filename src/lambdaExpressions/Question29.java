package lambdaExpressions;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Question29 {
    public static void main(String[] args) {
        BiPredicate<String, String> predicate = String::contains;
        BiFunction<String, String, Boolean> func = (str1, str2) -> {
            return predicate.test(str1, str2) ? true : false;
        };

        System.out.println(func.apply("Tomato", "at"));
    }
}
