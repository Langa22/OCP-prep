package lambdaExpressions;

import java.util.function.Consumer;

public class Question13 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::print;
        Integer i = 6;
        consumer.andThen(consumer).accept(i++); //Line 7
    }
}
