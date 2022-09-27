package Dumps;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer>values= Arrays.asList(1,2,3);
        values.stream()
                .map(n->n*2)
                .peek(System.out::println)
                .count();
    }
}
