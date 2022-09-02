package lambdaExpressions;

import java.util.stream.Stream;

public class Question77 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("d", "cc", "bbb", "aaaa");
        //stream.sorted().forEach(System.out::println);
        stream.sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
    }

}
