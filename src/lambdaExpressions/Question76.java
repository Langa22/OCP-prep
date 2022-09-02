package lambdaExpressions;

import java.util.Comparator;
import java.util.stream.Stream;

public class Question76 {
    public static void main(String[] args) {
        Comparator<Integer> comp = (i1, i2) -> i2.compareTo(i1);
        Stream<Integer> stream = Stream.of(55, 23, -9, 8, 42);
        stream.sorted(comp.reversed()).forEach(i -> System.out.print(i + " "));
    }
}
