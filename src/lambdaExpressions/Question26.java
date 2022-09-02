package lambdaExpressions;

import java.util.function.BiPredicate;

public class Question26 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        BiPredicate<String, String> predicate = String::startsWith;

        for(String str : arr) {
            if(predicate.negate().test(str, "A"))
                System.out.println(str);
        }
    }
}
