package lambdaExpressions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Question70 {
    public static void main(String[] args) {
        String text = "I am going to pass OCP exam in first attempt";
        Stream<String> stream = Arrays.stream(text.split(" "));
        IntSummaryStatistics stat = stream.mapToInt(s -> s.length()).summaryStatistics();
        System.out.println(stat.getMax());
    }
}
