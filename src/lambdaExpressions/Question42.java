package lambdaExpressions;

import java.util.stream.Stream;

public class Question42 {
    public static void main(String[] args) {
        Stream<StringBuilder> stream = Stream.of();
        stream.map(s -> s.reverse()).forEach(System.out::println);
    }
}
