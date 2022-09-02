package lambdaExpressions;

import java.util.Optional;
import java.util.stream.Stream;

public class Question50 {
    public static void main(String[] args) {
        Optional<Integer> optional = Stream.of(10).findFirst();
        System.out.println(optional);
    }
}
