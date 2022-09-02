package lambdaExpressions;

import java.util.Random;
import java.util.stream.IntStream;

public class Question63 {
    public static void main(String[] args) {
        IntStream stream = IntStream.generate(() -> new Random().nextInt(100)).limit(5);
        stream.filter(i -> i > 0 && i < 10).findFirst().ifPresent(System.out::println);
    }
}
