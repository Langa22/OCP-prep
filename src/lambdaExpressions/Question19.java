package lambdaExpressions;

import java.util.stream.LongStream;

public class Question19 {
    public static void main(String[] args) {
        LongStream.rangeClosed(51,75).filter(l -> l % 5 == 0)
                .forEach(l -> System.out.print(l + " "));
    }
}
