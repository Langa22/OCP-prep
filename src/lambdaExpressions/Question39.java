package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question39 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList (2, 3, 4);
        UnaryOperator<Long> operator = s -> s*s*s;
        //list.replaceAll(operator);
        list.forEach(System.out::println);
    }
}
