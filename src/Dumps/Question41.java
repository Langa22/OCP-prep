package Dumps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question41 {
    public static void main(String[] args) {
        List<String>str= Arrays.asList("my","pen","is","your","pen");
        Predicate<String>test=s -> {
            int i=0;
            boolean results=s.contains("pen");
            System.out.print((i++)+" : ");
            return results;
        };
        str.stream()
                .filter(test)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
