package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Question107 {
    public static void main(String[] args) {
        /* INSERT */
        //UnaryOperator<Character> operator= c->(char)(c.charValue()+1);
        Function<Character,Character>operator=c->(char)(c+1);
        List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U');
        vowels.stream().map(x -> operator.apply(x)).forEach(System.out::print); //Line n1

    }
}