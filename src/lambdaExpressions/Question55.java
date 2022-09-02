package lambdaExpressions;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Question55 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("and", "Or", "not", "Equals", "unary", "binary");
        Optional<String> optional = stream.filter(((Predicate<String>) Question55::isFirstCharVowel)
                .negate()).findFirst();
        System.out.println(optional.get());
    }

    private static boolean isFirstCharVowel(String str) {
        str = str.substring(0, 1).toUpperCase();
        switch(str) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                return true;
        }
        return false;
    }
}
