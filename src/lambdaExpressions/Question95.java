package lambdaExpressions;

import java.util.stream.Stream;

public class Question95 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.generate(() -> new Double("1.0")).limit(10);
        System.out.println(stream);
        System.out.println(stream.filter(d -> d > 2).allMatch(d -> d == 2));
    }
}
