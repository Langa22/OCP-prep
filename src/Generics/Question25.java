package Generics;

import java.util.Arrays;
import java.util.List;

public class Question25 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "E", "I", "O");
        list.remove("O");
        list.forEach(System.out::print);
    }
}
