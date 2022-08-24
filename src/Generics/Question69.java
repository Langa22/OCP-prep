package Generics;

import java.util.Arrays;
import java.util.List;

public class Question69 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "A", "b", "B", "c", "c");
        list.stream().distinct().forEach(System.out::print);
    }

}
