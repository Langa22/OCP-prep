package lambdaExpressions;

import java.util.stream.Stream;

public class Question44 {
    public static void main(String[] args) {
        Stream.of(true, false, true).map(b -> b.toString()
                .toUpperCase()).peek(System.out::println);
    }

}
