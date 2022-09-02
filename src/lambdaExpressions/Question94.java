package lambdaExpressions;

import java.util.stream.Stream;

public class Question94 {
    public static void main(String[] args) {
        //If you do not specify the limit it runs and never stops.
        Stream<Double> stream = Stream.generate(() -> new Double("1.0"));
        System.out.println(stream.sorted().findFirst());
    }
}
