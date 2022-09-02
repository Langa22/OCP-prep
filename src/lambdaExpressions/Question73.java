package lambdaExpressions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Question73 {
    public static void main(String[] args) {
        Stream<Double> stream = Arrays.asList(1.8, 2.2, 3.5).stream();
        System.out.println(stream.reduce(0.0,(d1,d2)->d1+d2));
    }
}
