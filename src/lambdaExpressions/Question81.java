package lambdaExpressions;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question81 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java", "python", "c",
                "c++", "java", "python");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set.size());
    }
}
