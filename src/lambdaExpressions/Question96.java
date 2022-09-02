package lambdaExpressions;

import java.util.Optional;
import java.util.stream.Stream;

public class Question96 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "as", "an", "and");
        Optional<String> first = stream.findFirst();
//        if (first.ifPresent()) {
//            System.out.println(first.get());
//        }
    }
}
