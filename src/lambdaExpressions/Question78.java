package lambdaExpressions;

import java.util.Comparator;
import java.util.stream.Stream;

public class Question78 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("d", "a", "mm", "bb", "zzz", "www");
        Comparator<String> lengthComp = (s1, s2) -> s1.length() - s2.length();
        //stream.sorted(lengthComp).forEach(System.out::println);
        stream.sorted(lengthComp.thenComparing(String::compareTo)).forEach(System.out::println);
    }
}
