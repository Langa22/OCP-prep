package lambdaExpressions;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

public class Question58 {
    public static void main(String[] args) {
        Stream<LocalDate> stream = Stream.of(LocalDate.of(2018, 1, 1), LocalDate.of(2018, 1, 1));
        Optional<LocalDate> optional = stream.distinct().findAny();

        System.out.println(optional.isPresent() + " : " + optional.get());
    }
}
